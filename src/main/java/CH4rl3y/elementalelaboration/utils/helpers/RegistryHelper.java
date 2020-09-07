package CH4rl3y.elementalelaboration.utils.helpers;

import CH4rl3y.elementalelaboration.blocks.ores.itemDropping.ItemDroppingOreBlock;
import CH4rl3y.elementalelaboration.blocks.ores.regular.RegularOreBlock;
import CH4rl3y.elementalelaboration.blocks.simpleBlocks.SimpleBlock;
import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.items.regular.RegularItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public final class RegistryHelper {

    public static void registerSingleRegularOre(String oreName) {
        Block ore = new RegularOreBlock(oreName);
        GameRegistry.registerBlock(ore, oreName);
    }

    public static void registerSingleRegularItem(String itemName) {
        Item item = new RegularItem(itemName);
        GameRegistry.registerItem(item, itemName);
    }

    public static void registerSingleItemDroppingOre(String oreName, String itemName) {
        Block ore = new ItemDroppingOreBlock(
                oreName,
                GameRegistry.findItem(Constants.MOD_ID, itemName)
        );
        GameRegistry.registerBlock(ore, oreName);
    }

    public static void registerSingleSimpleBlock(Material material, String blockName) {
        Block block = new SimpleBlock(material, blockName);
        GameRegistry.registerBlock(block, blockName);
    }
}
