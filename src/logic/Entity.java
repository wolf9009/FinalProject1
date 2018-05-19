package logic;

import sharedObject.IRenderable;

public abstract class Entity
implements IRenderable{
	protected double x,y,hp,speed; //position  x,y
	protected int z; //position that i will draw first
	protected boolean visible,destroyed; //can see and was destroy by anyreason
	
	protected Entity() { // make enermy,bullet and itembox
		visible = true;
		destroyed = false;
		this.hp = 100;
		this.speed = 20;
	}
	
	protected Entity(double hp,double speed) {
		visible = true;
		destroyed = false;
		this.hp = hp;
		this.speed = speed;
	}
	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	public int getZ() {
		return z;
	}
	
	public  abstract void update();
}
