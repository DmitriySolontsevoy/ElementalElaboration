package CH4rl3y.elementalelaboration.services.registry.blocks;

import CH4rl3y.elementalelaboration.blocks.ores.regular.RegularOreBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class BlockRegistryService {

    public static void registerBlocks() {
        BlockRegistryService.registerOres();
    }

    private static void registerOres() {
        BlockRegistryService.registerRegularOres();
        BlockRegistryService.registerItemDroppingOres();
    }

    private static void registerRegularOres() {
        Block aluminumOre = new RegularOreBlock("aluminumOre");
        GameRegistry.registerBlock(aluminumOre, "aluminumOre");

        Block cadmiumOre = new RegularOreBlock("cadmiumOre");
        GameRegistry.registerBlock(cadmiumOre, "cadmiumOre");

        Block chromiumOre = new RegularOreBlock("chromiumOre");
        GameRegistry.registerBlock(chromiumOre, "chromiumOre");

        Block cobaltOre = new RegularOreBlock("cobaltOre");
        GameRegistry.registerBlock(cobaltOre, "cobaltOre");

        Block copperOre = new RegularOreBlock("copperOre");
        GameRegistry.registerBlock(copperOre, "copperOre");

        Block hafniumOre = new RegularOreBlock("hafniumOre");
        GameRegistry.registerBlock(hafniumOre, "hafniumOre");

        Block indiumOre = new RegularOreBlock("indiumOre");
        GameRegistry.registerBlock(indiumOre, "indiumOre");
    }

    private static void registerItemDroppingOres() {

    }
}
