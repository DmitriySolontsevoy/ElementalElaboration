package CH4rl3y.elementalelaboration.services.registry.recipes.craftingRecipes;

import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.constants.ItemNames;
import CH4rl3y.elementalelaboration.constants.SimpleBlockNames;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public final class CraftingRecipesRegistryService {

    public static void registerCraftingRecipes() {
        CraftingRecipesRegistryService.registerShapedRecipes();
        CraftingRecipesRegistryService.registerShapelessRecipes();
    }

    private static void registerShapedRecipes() {
        GameRegistry.addShapedRecipe(
                new ItemStack(GameRegistry.findBlock(Constants.MOD_ID, SimpleBlockNames.DOLOMITE_BLOCK)),
                "###", "###", "###", '#', GameRegistry.findItem(Constants.MOD_ID, ItemNames.DOLOMITE_CRYSTAL));
    }

    private static void registerShapelessRecipes() {

    }
}
