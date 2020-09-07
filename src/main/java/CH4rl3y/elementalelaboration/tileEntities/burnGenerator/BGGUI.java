package CH4rl3y.elementalelaboration.tileEntities.burnGenerator;

import CH4rl3y.elementalelaboration.constants.Constants;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BGGUI extends GuiContainer {

	private BurnGeneratorTileEntity bg;
	
    public BGGUI(IInventory playerInv, BurnGeneratorTileEntity bg, EntityPlayer player) {
        super(new BGContainerGUI(playerInv, bg, player));

        this.bg = bg;
        
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.mc.getTextureManager().bindTexture(new ResourceLocation(Constants.MOD_ID + ":textures/guis/burnGenerator.png"));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        
        if (bg.processing) {
        	this.drawTexturedModalRect(this.guiLeft + 66, this.guiTop + 49 + (int) (14 * (1 - this.bg.getFraction()) ), 690, (int) (14 * (1 - this.bg.getFraction()) ), 60, (int) (14 * this.bg.getFraction()));
        }
        
        this.drawTexturedModalRect(this.guiLeft + 112, this.guiTop + 58 - this.bg.storage/2381, 690, 15, 60, this.bg.storage/2381);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
    	this.mc.fontRenderer.drawString("Burn Generator", 50, 5, 0, false);
    	GL11.glPushMatrix();
    	GL11.glScalef(0.8f, 0.8f, 0.8f);
    	this.mc.fontRenderer.drawString(String.valueOf(this.bg.storage), 135, 78, 0xFFFFFF, false);
    	GL11.glPopMatrix();
    }
}