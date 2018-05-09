package logic;

public class CollidableEntity extends Entity {
	protected double width ,height , collideDamage;
	public int side;
	
	protected CollidableEntity(double hp,double speed) {
		super(hp,speed);
	}
	
	protected boolean collideWith(CollidableEntity other) {
		if(this instanceof Bullet && other instanceof Bullet) {
			return false;
		}
	}
}
