package CH4rl3y.elementalelaboration.blocks.ores.regular;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegularOreBlock extends Block {

    public RegularOreBlock(String blockName) {
        super(Material.rock);
        this.setBlockName(blockName);
        this.setBlockTextureName(Constants.MOD_ID + ":" + blockName);
        this.setCreativeTab(Constants.creativeTab);
    }
}
