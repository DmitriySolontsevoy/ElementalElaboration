package CH4rl3y.elementalelaboration.items;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.item.Item;

public class QuadSulfurMagnesiumBattery extends Item {

	protected QuadSulfurMagnesiumBattery() {
		setCreativeTab(Constants.creativeTab);
		setUnlocalizedName("quadSulfurMagnesiumBattery");
		setMaxStackSize(1);
		setNoRepair();
		setTextureName(Constants.MOD_ID + ":" + "quadSulfurMagnesiumBattery");
        setMaxDamage(20000);
	}
}