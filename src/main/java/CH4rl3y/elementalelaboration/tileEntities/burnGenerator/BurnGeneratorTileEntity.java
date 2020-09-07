package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class BurnGeneratorTileEntity extends TileEntity implements IInventory {
	
	int gen, ticks, outNum, max = 100000;

	public ItemStack[] inventory;
	public int storage;
    public String customName;
    public boolean processing = false;
    
	@Override
    public void updateEntity() {
		if (getStackInSlot(1) != null) {
			if (getStackInSlot(1).getItemDamage() > 0 && this.storage > 10) {
				this.storage = this.storage - 10;
				getStackInSlot(1).setItemDamage(getStackInSlot(1).getItemDamage() - 10);
			}
		}
		
		if (getStackInSlot(0) != null && !processing) {
			if (getStackInSlot(0).getItem().equals(Items.coal) && max != this.storage) {
				processing = !processing;
				gen = ticks = 80;
				decrStackSize(0, 1);
			}
		} else {
			if (processing) {
                if (ticks > 0) {
                    ticks--;
                    if (max - this.storage >= 16)
                        this.storage += 16;
                } else {
                    gen = 0;
                    processing = false;
                }
            }
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) ==
                this &&
                player.getDistanceSq(
                        (double) this.xCoord + 0.5D,
                        (double) this.yCoord + 0.5D,
                        (double) this.zCoord + 0.5D) <= 64.0D;
	}

    public double getFraction() {
		return (double)ticks/(double)gen;
	}
	
    public BurnGeneratorTileEntity() {
        this.inventory = new ItemStack[this.getSizeInventory()];
    }

    public String getCustomName() {
        return this.customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public boolean hasCustomName() {
        return this.customName != null && !this.customName.equals("");
    }
    
    @Override
    public int getSizeInventory() {
        return 2;
    } 
    
    @Override
    public ItemStack getStackInSlot(int index) {
        if (index < 0 || index >= this.getSizeInventory())
            return null;
        return this.inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.getStackInSlot(index) != null) {
            ItemStack itemstack;

            if (this.getStackInSlot(index).stackSize <= count) {
                itemstack = this.getStackInSlot(index);
                this.setInventorySlotContents(index, null);
                this.markDirty();
                return itemstack;
            } else {
                itemstack = this.getStackInSlot(index).splitStack(count);

                if (this.getStackInSlot(index).stackSize <= 0) {
                    this.setInventorySlotContents(index, null);
                } else {
                    this.setInventorySlotContents(index, this.getStackInSlot(index));
                }

                this.markDirty();
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        ItemStack stack = this.getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();
            
        if (stack != null && stack.stackSize == 0)
            stack = null;

        this.inventory[index] = stack;
        this.markDirty();
    }
    
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }
    
    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null) {
                NBTTagCompound stackTag = new NBTTagCompound();
                stackTag.setByte("Slot", (byte) i);
                this.getStackInSlot(i).writeToNBT(stackTag);
                list.appendTag(stackTag);
            }
        }
        nbt.setTag("Items", list);
        nbt.setInteger("Storage", this.storage);

        if (this.hasCustomName()) {
            nbt.setString("CustomName", this.getCustomName());
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        
        NBTTagList list = nbt.getTagList("Items", 10);
        for (int i = 0; i < list.tagCount(); ++i) {
            NBTTagCompound stackTag = list.getCompoundTagAt(i);
            int slot = stackTag.getByte("Slot") & 255;
            this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
        }
        this.storage = nbt.getInteger("Storage");
        
        if (nbt.hasKey("CustomName", 8)) {
            this.setCustomName(nbt.getString("CustomName"));
        }
    }

	@Override
	public String getInventoryName() {
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    public GuiContainer getClientGUI(EntityPlayer player) {
        return new BGGUI(player.inventory, this, player);
    }

    public Container getServerGUI(EntityPlayer player) {
	    return new BGContainerGUI(player.inventory, this, player);
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        this.writeToNBT(tagCompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 3, tagCompound);
    }

    @Override
    public void onDataPacket(NetworkManager networkManager, S35PacketUpdateTileEntity packet) {
        NBTTagCompound tagCompound = packet.func_148857_g();
        this.readFromNBT(tagCompound);
    }
}
    
