package CH4rl3y.elementalelaboration.services.registry.tileEntities;

import CH4rl3y.elementalelaboration.constants.TileEntityNames;
import CH4rl3y.elementalelaboration.tileEntities.burnGenerator.BurnGeneratorTileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public final class TileEntityRegistryService {

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(BurnGeneratorTileEntity.class, TileEntityNames.BURN_GENERATOR);
    }
}
