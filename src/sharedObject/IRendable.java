package sharedObject;

import javafx.scene.canvas.GraphicsContext;

public interface IRendable {
	public int getZ();
	
	public boolean isDestroyed();
	
	public boolean isVisible();
}
