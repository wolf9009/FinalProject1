package logic;

import javafx.scene.shape.Shape;

//ยังไม่มี bullet
public abstract class CollidableEntity 
extends Entity {
	protected double width ,height , collideDamage;
	public int side; //enermy -1,my dragon 1
	
	protected CollidableEntity(double hp,double speed) {
		super(hp,speed);
	}
	
	protected boolean collideWith(CollidableEntity other) {
		if(this instanceof Bullet && other instanceof Bullet) {
			return false;//bullet cant collide other bullet
		}
		if ((this instanceof Bullet && other instanceof Items) || (this instanceof Items && other instanceof Bullet)) {
			return false;//bullet cant collide the dragon power up box
		}
		if (this.side != other.side) {
			Shape intersect = Shape.intersect(this.getBoundary(), other.getBoundary());
			return (intersect.getBoundsInLocal().getWidth() != -1);
		}
		return false;//if not collide return false till collide
	}
	
	public abstract void onCollision(CollidableEntity others);//call when object collide

	public abstract Shape getBoundary();

	
	}
	

