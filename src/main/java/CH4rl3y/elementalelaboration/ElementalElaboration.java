package CH4rl3y.elementalelaboration;

import CH4rl3y.elementalelaboration.constants.Constants;
import CH4rl3y.elementalelaboration.services.GUIHandler.GUIHandler;
import CH4rl3y.elementalelaboration.services.registry.RegistryService;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = Constants.MOD_ID, name="Elemental Elaboration", version = Constants.VERSION)
public class ElementalElaboration {

    @Instance("elementalelaboration")
    public static ElementalElaboration instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        RegistryService.registerAll();
        NetworkRegistry.INSTANCE.registerGuiHandler(ElementalElaboration.instance, new GUIHandler());

        Constants.creativeTab.setIcon(
                Item.getItemFromBlock(GameRegistry.findBlock(Constants.MOD_ID, "aluminumOre"))
        );
    }
}
