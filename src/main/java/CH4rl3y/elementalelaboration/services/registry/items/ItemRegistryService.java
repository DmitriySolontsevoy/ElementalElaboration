package CH4rl3y.elementalelaboration.services.registry.items;

import CH4rl3y.elementalelaboration.constants.ItemNames;
import CH4rl3y.elementalelaboration.constants.MetalIngotNames;
import CH4rl3y.elementalelaboration.utils.helpers.RegistryHelper;

public final class ItemRegistryService {

    public static void registerItems() {
        RegistryHelper.registerSingleRegularItem(ItemNames.DOLOMITE_CRYSTAL);
        RegistryHelper.registerSingleRegularItem(ItemNames.SULFUR);

        RegistryHelper.registerSingleRegularItem(MetalIngotNames.ALUMINUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.CADMIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.CHROMIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.COBALT_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.COPPER_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.HAFNIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.INDIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.IRIDIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.LEAD_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.LITHIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.MAGNESIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.MANGANESE_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.MOLYBDENUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.NICKEL_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.NIOBIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.OSMIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.PALLADIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.PLATINUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.RHODIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.SILVER_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.STEEL_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.THORIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.TIN_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.TITANIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.TUNGSTEN_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.URANIUM_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.ZINC_INGOT);
        RegistryHelper.registerSingleRegularItem(MetalIngotNames.ZIRCONIUM_INGOT);

        RegistryHelper.registerSingleRegularItem("sulfurMagnesiumBattery");
        RegistryHelper.registerSingleRegularItem("quadSulfurMagnesiumBattery");
    }
}
