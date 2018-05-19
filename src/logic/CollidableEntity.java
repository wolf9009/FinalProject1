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
			return false;//ไม่ชนกระสุน
		}
		if ((this instanceof Bullet && other instanceof Items) || (this instanceof Items && other instanceof Bullet)) {
			return false;//ไม่ชนกล่องไอเทม
		}
		if (this.side != other.side) {
			Shape intersect = Shape.intersect(this.getBoundary(), other.getBoundary());
			return (intersect.getBoundsInLocal().getWidth() != -1);
		}
		return false;//if not collide return false till collide
	}
	
	public abstract void onCollision(CollidableEntity others);//call when ocject collide

	public abstract Shape getBoundary();

	
	}
	

