package CH4rl3y.elementalelaboration.services.GUIHandler;

import CH4rl3y.elementalelaboration.tileEntities.burnGenerator.BGContainerGUI;
import CH4rl3y.elementalelaboration.tileEntities.burnGenerator.BGGUI;
import CH4rl3y.elementalelaboration.tileEntities.burnGenerator.BurnGeneratorTileEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GUIHandler implements IGuiHandler {

	public static final int TS_GUI = 0;
	public static final int CA_GUI = 1;
	public static final int EC_GUI = 2;
	public static final int MR_GUI = 3;
	public static final int IG_GUI = 4;
	public static final int PC_GUI = 5;
	public static final int BG_GUI = 6;

	@Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		Container GUI = null;

	    switch (id) {
	    	case 0: /*GUI = new TSContainerGUI(player.inventory, (TripleSmelteryTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 1: /*GUI = new CAContainerGUI(player.inventory, (CircuitAssemblerTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 2: /*GUI = new ECContainerGUI(player.inventory, (EnergizingChamberTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 3: /*GUI = new MRContainerGUI(player.inventory, (MetalRollerTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 4: /*GUI = new IGContainerGUI(player.inventory, (IndustrialGrinderTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 5: /*GUI = new PCContainerGUI(player.inventory, (PistonCompressorTileEntity) world.getTileEntity(x, y, z), player);*/ break;
	    	case 6:
	    		TileEntity tileEntity = world.getTileEntity(x, y, z);
	    		GUI = ((BurnGeneratorTileEntity) tileEntity).getServerGUI(player);
	    	break;
	    }
	    return GUI;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	GuiContainer GUI = null;

    	switch (id) {
    		case 0: /*GUI = new TSGUI(player.inventory, (TripleSmelteryTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 1: /*GUI = new CAGUI(player.inventory, (CircuitAssemblerTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 2: /*GUI = new ECGUI(player.inventory, (EnergizingChamberTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 3: /*GUI = new MRGUI(player.inventory, (MetalRollerTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 4:/* GUI = new IGGUI(player.inventory, (IndustrialGrinderTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 5: /*GUI = new PCGUI(player.inventory, (PistonCompressorTileEntity) world.getTileEntity(x, y, z), player);*/ break;
    		case 6: GUI = ((BurnGeneratorTileEntity) world.getTileEntity(x, y, z)).getClientGUI(player); break;
    	}
    	return GUI;
    }
}