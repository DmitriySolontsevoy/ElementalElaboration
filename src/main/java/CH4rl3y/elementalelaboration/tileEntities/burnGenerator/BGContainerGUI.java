package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class BGContainerGUI extends Container {

	private BurnGeneratorTileEntity bg;

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return ((IInventory) this.bg).isUseableByPlayer(playerIn);
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();
 
            if (fromSlot < 2) {
                if (!this.mergeItemStack(current, 2, 37, true))
                    return null;
            } else {
	            if (!this.mergeItemStack(current, 0, 1, false))
	                return null;
            }

            if (current.stackSize == 0)
                slot.putStack(null);
            else
                slot.onSlotChanged();

            if (current.stackSize == previous.stackSize)
                return null;

            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }
    
    public BGContainerGUI(IInventory playerInv, BurnGeneratorTileEntity bg) {
    	this.bg = bg;
    	
    	Slot slotIn = new Slot(bg, 0, 80, 30);
    	Slot slotCharge = new ChargeInput(bg, 1, 40, 30);
    	
        // Tile Entity, Slot 0-1, Slot IDs 0-1
        this.addSlotToContainer(slotIn);
        this.addSlotToContainer(slotCharge);
        
        // Player Inventory, Slot 10-36, Slot IDs 10-36
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 37-45
        for (int x = 0; x < 9; ++x) {
            this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
        }
    }
}