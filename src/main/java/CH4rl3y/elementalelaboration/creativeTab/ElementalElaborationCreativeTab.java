package CH4rl3y.elementalelaboration.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElementalElaborationCreativeTab extends CreativeTabs {

    private Item icon;

    public ElementalElaborationCreativeTab() {
        super("elementalElaboration");
    }

    @Override
    public Item getTabIconItem() {
        return this.icon;
    }

    public void setIcon(Item icon) {
        this.icon = icon;
    }
}
