package logic;

import javafx.scene.image.Image;
import javafx.scene.shape.Shape;

public class Bullet 
extends CollidableEntity
{

	private Image bulletSprite;
	private int type;
	private static int zCounter = -500;
	private int speedX,speedY;
	private boolean exploding = false;
	
	protected Bullet(double hp, double speed) {
		super(hp, speed);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onCollision(CollidableEntity others) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Shape getBoundary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
