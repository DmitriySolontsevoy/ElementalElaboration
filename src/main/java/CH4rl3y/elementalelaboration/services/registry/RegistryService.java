package CH4rl3y.elementalelaboration.services.registry;

import CH4rl3y.elementalelaboration.services.registry.blocks.BlockRegistryService;
import CH4rl3y.elementalelaboration.services.registry.items.ItemRegistryService;

public final class RegistryService {

    public static void registerAll() {
        BlockRegistryService.registerBlocks();
        ItemRegistryService.registerItems();
    }
}
