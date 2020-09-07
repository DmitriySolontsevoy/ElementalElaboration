package CH4rl3y.elementalelaboration.services.registry.recipes.smeltingRecipes;

import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.constants.MetalIngotNames;
import CH4rl3y.elementalelaboration.constants.OreBlockNames;
import CH4rl3y.elementalelaboration.utils.helpers.RegistryHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public final class SmeltingRecipesRegistryService {

    public static void registerSmeltingRecipes() {
        SmeltingRecipesRegistryService.registerOreSmeltingRecipes();
    }

    private static void registerOreSmeltingRecipes() {
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.ALUMINUM_ORE, MetalIngotNames.ALUMINUM_INGOT, 0.5f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.CADMIUM_ORE, MetalIngotNames.CADMIUM_INGOT, 0.55f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.CHROMIUM_ORE, MetalIngotNames.CHROMIUM_INGOT, 1f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.COBALT_ORE, MetalIngotNames.COBALT_INGOT, 0.8f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.COPPER_ORE, MetalIngotNames.COPPER_INGOT, 0.6f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.HAFNIUM_ORE, MetalIngotNames.HAFNIUM_INGOT, 1.1f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.INDIUM_ORE, MetalIngotNames.INDIUM_INGOT, 0.4f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.IRIDIUM_ORE, MetalIngotNames.IRIDIUM_INGOT, 2f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.LEAD_ORE, MetalIngotNames.LEAD_INGOT, 0.5f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.LITHIUM_ORE, MetalIngotNames.LITHIUM_INGOT, 0.2f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.MAGNESIUM_ORE, MetalIngotNames.MAGNESIUM_INGOT, 0.4f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.MANGANESE_ORE, MetalIngotNames.MANGANESE_INGOT, 0.5f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.MOLYBDENUM_ORE, MetalIngotNames.MOLYBDENUM_INGOT, 0.75f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.NICKEL_ORE, MetalIngotNames.NICKEL_INGOT, 0.65f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.NIOBIUM_ORE, MetalIngotNames.NIOBIUM_INGOT, 0.85f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.OSMIUM_ORE, MetalIngotNames.OSMIUM_INGOT, 1.35f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.PALLADIUM_ORE, MetalIngotNames.PALLADIUM_INGOT, 0.4f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.RHODIUM_ORE, MetalIngotNames.RHODIUM_INGOT, 1f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.SILVER_ORE, MetalIngotNames.SILVER_INGOT, 0.9f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.THORIUM_ORE, MetalIngotNames.THORIUM_INGOT, 0.8f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.TIN_ORE, MetalIngotNames.TIN_INGOT, 0.45f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.TITANIUM_ORE, MetalIngotNames.TITANIUM_INGOT, 0.95f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.TUNGSTEN_ORE, MetalIngotNames.TUNGSTEN_INGOT, 1.3f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.URANIUM_ORE, MetalIngotNames.URANIUM_INGOT, 1.5f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.ZINC_ORE, MetalIngotNames.ZINC_INGOT, 0.35f);
        SmeltingRecipesRegistryService
                .registerSingleOreSmeltingRecipe(OreBlockNames.ZIRCONIUM_ORE, MetalIngotNames.ZIRCONIUM_INGOT, 0.3f);
    }

    private static void registerSingleOreSmeltingRecipe(String oreName, String productName, Float exp) {
        GameRegistry.addSmelting(
                GameRegistry.findBlock(Constants.MOD_ID, oreName),
                new ItemStack(GameRegistry.findItem(Constants.MOD_ID, productName)),
                exp
        );
    }
}
