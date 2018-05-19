package sharedObject;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable {
	public int getZ();
	
	public boolean isDestroyed();
	
	public void draw(GraphicsContext gc);//to draw bullet
	
	public boolean isVisible();
}
