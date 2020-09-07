package CH4rl3y.elementalelaboration.items;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.item.Item;

public class SulfurMagnesiumBattery extends Item {

	protected SulfurMagnesiumBattery() {
		setCreativeTab(Constants.creativeTab);
		setUnlocalizedName("sulfurMagnesiumBattery");
		setMaxStackSize(1);
		setNoRepair();
		setTextureName(Constants.MOD_ID + ":" + "sulfurMagnesiumBattery");
        setMaxDamage(5000);
	}
}