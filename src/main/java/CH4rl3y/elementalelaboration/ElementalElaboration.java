package CH4rl3y.elementalelaboration;

import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.services.registry.RegistryService;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = Constants.MOD_ID, version = Constants.VERSION)
public class ElementalElaboration {

    @EventHandler
    public void init(FMLInitializationEvent event) {
        RegistryService.registerAll();

        Constants.creativeTab.setIcon(
                Item.getItemFromBlock(GameRegistry.findBlock(Constants.MOD_ID, "aluminumOre"))
        );
    }
}
