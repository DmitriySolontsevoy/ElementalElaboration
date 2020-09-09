package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import CH4rl3y.elementalelaboration.constants.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ChargeInput extends Slot {

    public ChargeInput(IInventory parIInventory, int parSlotIndex, int parXDisplayPosition, int parYDisplayPosition) {
        super(parIInventory, parSlotIndex, parXDisplayPosition, parYDisplayPosition);
    }
    
    @Override
    public boolean isItemValid(ItemStack stack) {
        return stack.getItem().equals(GameRegistry.findItem(Constants.MOD_ID, "quadSulfurMagnesiumBattery"))
                || stack.getItem().equals(GameRegistry.findItem(Constants.MOD_ID, "sulfurMagnesiumBattery"));
    }
}