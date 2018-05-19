package logic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import window.SceneManager;

public class Items extends CollidableEntity {
	private static int zCounter = -725; // z between -725 to -750

	protected Items(double speed) {
		super(1, speed);
		// TODO Auto-generated constructor stub
		this.side =1;
		this.z = zCounter;
		if(zCounter > -725) {
			zCounter = - 750;
		}
	}

	@Override
	public Shape getBoundary() {//get a boundary of the box
		Rectangle bound = new Rectangle();
		bound.setX(width);
		bound.setY(height);
		bound.setWidth(width);
		bound.setHeight(height);
		return bound;
	}

	@Override
	public void update() {
		this.y += speed;
		if(this.isOutofScreen()) {
			this.visible = false;
			this.destroyed = true;
		}
		
	}

	public boolean isOutofScreen() {
		if((int)this.y > SceneManager.Scene_HEIGHT) {
			return true;
		}
		return false;
	}

	
}
