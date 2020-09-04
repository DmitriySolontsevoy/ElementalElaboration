package CH4rl3y.elementalelaboration.items.regular;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.item.Item;

public class RegularItem extends Item {

    public RegularItem(String itemName) {
        super();
        this.setUnlocalizedName(itemName);
        this.setTextureName(Constants.MOD_ID + ":" + itemName);
        this.setCreativeTab(Constants.creativeTab);
    }
}
