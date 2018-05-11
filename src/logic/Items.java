package logic;

import javafx.scene.shape.Shape;

public class Items extends CollidableEntity {
	private static int zCounter = -725; // z between -725 to -750

	protected Items(double speed) {
		super(1, speed);
		// TODO Auto-generated constructor stub
		this.side =1;
		this.z = zCounter;
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
