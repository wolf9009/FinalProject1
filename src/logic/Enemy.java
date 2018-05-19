package logic;

public abstract class Enemy extends CollidableEntity {
	private static int zCounter = -200;
	
	
	
	
	public Enemy(double hp, double speed) {
		super(hp, speed);
		this.side = -1;
		this.z = -1;
		zCounter++;
		if(zCounter > -100) {
			zCounter = -200;
		}
		
//		GameLogic.currentEnemyNum++;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
