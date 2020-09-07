package CH4rl3y.elementalelaboration.services.registry;

import CH4rl3y.elementalelaboration.services.registry.blocks.BlockRegistryService;
import CH4rl3y.elementalelaboration.services.registry.items.ItemRegistryService;
import CH4rl3y.elementalelaboration.services.registry.recipes.craftingRecipes.CraftingRecipesRegistryService;
import CH4rl3y.elementalelaboration.services.registry.recipes.smeltingRecipes.SmeltingRecipesRegistryService;
import CH4rl3y.elementalelaboration.services.registry.tileEntities.TileEntityRegistryService;

public final class RegistryService {

    public static void registerAll() {
        ItemRegistryService.registerItems();
        BlockRegistryService.registerBlocks();
        TileEntityRegistryService.registerTileEntities();
        CraftingRecipesRegistryService.registerCraftingRecipes();
        SmeltingRecipesRegistryService.registerSmeltingRecipes();
    }
}
