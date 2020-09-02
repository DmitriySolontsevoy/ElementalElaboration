package CH4rl3y.elementalelaboration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = ElementalElaboration.MODID, version = ElementalElaboration.VERSION)
public class ElementalElaboration
{
    public static final String MODID = "elementalelaboration";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Block amethystOre = new ModBlock(Material.rock, "amethystOre");
        GameRegistry.registerBlock(amethystOre, "amethystOre");
    }

    private class ModBlock extends Block
    {
        public ModBlock(Material material, String blockName)
        {
            super(material);
            this.setBlockName(blockName);
            this.setBlockTextureName(MODID + ":" + blockName);
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }

    private class ModBlock2 extends Block
    {
        public ModBlock2(Material material, String blockName)
        {
            super(material);
            this.setBlockName(blockName);
            this.setBlockTextureName(MODID + ":" + blockName);
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }
}
