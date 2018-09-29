public interface class Movable
{
	public abstract void moveUp();
	public abstract void moveDown();
	public abstract void moveLeft();
	public abstract void moveRight();
}

public class MovablePoint extends Movable
{
	default int x, y, xSpeed, ySpeed;

	public MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString()

	public abstract void moveUp(){
		y = ++y;
	}
	public abstract void moveDown(){
		y = --y;
	}
	public abstract void moveLeft(){
		x = --x;
	}
	public abstract void moveRight(){
		x = ++x;
	}
}

public class MovableCircle extends Movable
{
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
		center.x = x;
		center.y = y;
		center.xSpeed = xSpeed;
		center.ySpeed = ySpeed;
		this.radius = radius;
	}

	public String toString()

	public void moveUp(){
		center.moveUp();
	}
	public void moveDown(){
		center.moveDown();
	}
	public void moveLeft(){
		center.moveLeft();
	}
	public void moveRight(){
		center.moveRight();
	}
}

public static void main()
{
	point = new(MovablePoint());
	circle = new(MovableCircle());
}