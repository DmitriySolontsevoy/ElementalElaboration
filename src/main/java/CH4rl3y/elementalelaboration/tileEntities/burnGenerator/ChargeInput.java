package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import CH4rl3y.elementalelaboration.constants.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ChargeInput extends Slot {

    private final EntityPlayer thePlayer;
    private int numTSOutput;

    public ChargeInput(EntityPlayer parPlayer, IInventory parIInventory, int parSlotIndex, int parXDisplayPosition, int parYDisplayPosition) {
        super(parIInventory, parSlotIndex, parXDisplayPosition, parYDisplayPosition);
        thePlayer = parPlayer;
    }
    
    @Override
    public boolean isItemValid(ItemStack stack) {
        return stack.getItem().equals(GameRegistry.findItem(Constants.MOD_ID, "quadSulfurMagnesiumBattery"))
                || stack.getItem().equals(GameRegistry.findItem(Constants.MOD_ID, "sulfurMagnesiumBattery"));
    }
}