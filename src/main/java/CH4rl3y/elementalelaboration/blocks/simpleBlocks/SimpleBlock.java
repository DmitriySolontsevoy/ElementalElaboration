package CH4rl3y.elementalelaboration.blocks.simpleBlocks;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SimpleBlock extends Block {

    public SimpleBlock(Material material, String blockName) {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Constants.MOD_ID + ":" + blockName);
        this.setCreativeTab(Constants.creativeTab);
    }
}
