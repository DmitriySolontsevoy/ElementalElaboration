package CH4rl3y.elementalelaboration.services.registry.blocks;

import CH4rl3y.elementalelaboration.constants.ItemNames;
import CH4rl3y.elementalelaboration.constants.OreBlockNames;
import CH4rl3y.elementalelaboration.constants.SimpleBlockNames;
import CH4rl3y.elementalelaboration.constants.TileEntityNames;
import CH4rl3y.elementalelaboration.tileEntities.burnGenerator.BurnGenerator;
import CH4rl3y.elementalelaboration.utils.helpers.RegistryHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public final class BlockRegistryService {

    public static void registerBlocks() {
        BlockRegistryService.registerOres();
        BlockRegistryService.registerSimpleBlocks();
        BlockRegistryService.registerTileEntityContainers();
    }

    private static void registerOres() {
        BlockRegistryService.registerRegularOres();
        BlockRegistryService.registerItemDroppingOres();
    }

    private static void registerSimpleBlocks() {
        RegistryHelper.registerSingleSimpleBlock(Material.rock, SimpleBlockNames.DOLOMITE_BLOCK);
    }

    private static void registerTileEntityContainers() {
        BurnGenerator burnGenerator = new BurnGenerator();
        GameRegistry.registerBlock(burnGenerator, TileEntityNames.BURN_GENERATOR);
    }

    private static void registerRegularOres() {
        RegistryHelper.registerSingleRegularOre(OreBlockNames.ALUMINUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.CADMIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.CHROMIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.COBALT_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.COPPER_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.HAFNIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.INDIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.IRIDIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.LEAD_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.LITHIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.MAGNESIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.MANGANESE_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.MOLYBDENUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.NICKEL_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.NIOBIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.OSMIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.PALLADIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.PLATINUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.RHODIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.SILVER_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.THORIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.TIN_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.TITANIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.TUNGSTEN_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.URANIUM_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.ZINC_ORE);
        RegistryHelper.registerSingleRegularOre(OreBlockNames.ZIRCONIUM_ORE);
    }

    private static void registerItemDroppingOres() {
        RegistryHelper.registerSingleItemDroppingOre(OreBlockNames.DOLOMITE_ORE, ItemNames.DOLOMITE_CRYSTAL);
        RegistryHelper.registerSingleItemDroppingOre(OreBlockNames.SULFUR_ORE, ItemNames.SULFUR);
    }
}
