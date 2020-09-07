package CH4rl3y.elementalelaboration.blocks.ores.itemDropping;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class ItemDroppingOreBlock extends Block {

    private Item dropItem;

    public ItemDroppingOreBlock(String blockName, Item dropItem) {
        super(Material.rock);
        this.setBlockName(blockName);
        this.setBlockTextureName(Constants.MOD_ID + ":" + blockName);
        this.setCreativeTab(Constants.creativeTab);
        this.dropItem = dropItem;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return this.dropItem;
    }

    @Override
    public int damageDropped(int metadata) {
        return 1;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }
}
