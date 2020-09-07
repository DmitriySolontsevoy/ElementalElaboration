package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import CH4rl3y.elementalelaboration.ElementalElaboration;
import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.constants.TileEntityNames;
import CH4rl3y.elementalelaboration.services.GUIHandler.GUIHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BurnGenerator extends BlockContainer {

    public IIcon[] icons = new IIcon[6];
    public int storage;

    public BurnGenerator() {
        super(Material.iron);
        setBlockName(TileEntityNames.BURN_GENERATOR);
        setHardness(4.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Constants.creativeTab);
    }
    
    @Override
    public void registerBlockIcons(IIconRegister reg) {
            this.icons[3] = reg.registerIcon(Constants.MOD_ID + ":" + "metalRollerTop");
            this.icons[0] = reg.registerIcon(Constants.MOD_ID + ":" + "machineCasing");
            this.icons[1] = reg.registerIcon(Constants.MOD_ID + ":" + "machineCasing");
            this.icons[2] = reg.registerIcon(Constants.MOD_ID + ":" + "machineCasing");
            this.icons[4] = reg.registerIcon(Constants.MOD_ID + ":" + "machineCasing");
            this.icons[5] = reg.registerIcon(Constants.MOD_ID + ":" + "machineCasing");
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? this.icons[0] : (side == 0 ? this.icons[0] : (side != meta ? this.icons[0] : this.icons[3]));
    }
    
    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int side) {
    	BurnGeneratorTileEntity te = (BurnGeneratorTileEntity) world.getTileEntity(x, y ,z);
    	storage = te.storage;

    	for (int i = 0; i < 2; i++) {
    		EntityItem item;
    		ItemStack itemstack = te.getStackInSlot(i);

        	if (itemstack != null) {
        		int quantity = itemstack.stackSize;

        		item = new EntityItem(world, (float)x, (float)y, (float)z, new ItemStack(itemstack.getItem(), quantity, itemstack.getItemDamage()));

        		if (itemstack.hasTagCompound()) {
            		item.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
            	}
            	world.spawnEntityInWorld(item);
        	}
    	}
        super.breakBlock(world, x, y, z, block, side);
    }
    
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return null;
    }
    
    @Override
    public final ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
    	ItemStack stack = new ItemStack(
                GameRegistry.findBlock(
                        Constants.MOD_ID, TileEntityNames.BURN_GENERATOR
                ), 1, storage);
    	drops.add(stack);
    	return drops;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
    	BurnGeneratorTileEntity te = (BurnGeneratorTileEntity) world.getTileEntity(x, y ,z);
    	te.storage = itemstack.getItemDamage();

        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
    
    @Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,
                                    int par6, float par7, float par8, float par9) {

	    if (!world.isRemote) {
	        player.openGui(ElementalElaboration.instance, GUIHandler.BG_GUI, world, x, y, z);
	    }

	    return true;
	}
    
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
    	return new BurnGeneratorTileEntity();
    }
}