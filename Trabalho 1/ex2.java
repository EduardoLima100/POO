interface class Movable
{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

public class MovablePoint implements Movable
{
	default int x, y, xSpeed, ySpeed;

	public MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString(){
		String str = "x: " + x + "\ny: " + y + "\nxSpeed: " + xSpeed + "\nySpeed: " + ySpeed;
		return str;
	}

	void moveUp(){
		y = ++y;
	}
	void moveDown(){
		y = --y;
	}
	void moveLeft(){
		x = --x;
	}
	void moveRight(){
		x = ++x;
	}
}

public class MovableCircle implements Movable
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

	public String toString(){
		String str = center.toString() + "\nRadius: " + radius;
		return str;
	}

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

public static void main(String args[])
{

	MovablePoint point = new MovablePoint(1,3,1,1);
	MovableCircle circle = new MovableCircle(1,3,1,1,5);

	System.out.println("Info ponto: " + point.toString());
	System.out.println("Info circle: " + circle.toString());

	point.moveRight();
	point.moveRight();
	point.moveRight();
	point.moveRight();
	point.moveRight();

	circle.moveLeft();
	circle.moveLeft();
	circle.moveRight();
	circle.moveDown();
	circle.moveDown();

	System.out.println("Info ponto: " + point.toString());
	System.out.println("Info circle: " + circle.toString());
}