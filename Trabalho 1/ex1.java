abstract class Shape
{
	protected String color;
	protected boolean filled;

	public Shape();

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color
	}

	public  void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();


}

public class Circle extends Shape
{
	protected double radius;

	public Circle(){
		super();
	}

	public Circle(double radius){
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getArea(){
		return 3.14159265359 * radius * radius;
	}
	public double getPerimeter(){
		return 2 * 3.14159265359 * radius;
	}
	public String toString(){
		String str = "Color: " + getColor() + "\n";
		if(isFilled()) str += "Is filled";
		else str += "Isn't filled";
		str += "\nRadius: " + getRadius();
		return str;
	}
}

public class Rectangle extends Shape
{
	protected double width, lenght;

	public Rectangle(){
		super();
	}

	public Rectangle(double width,double lenght){
		super();
		this.width = width;
		this.lenght = lenght;
	}

	public Rectangle(double width, double lenght,String color,double filled){
		super(color,filled);
		this.width = width;
		this.lenght = lenght;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getLength(){
		return length;
	}

	public void setLength(double length){
		this.length = length;
	}

	public double getArea(){
		return width * length;
	}
	public double getPerimeter(){
		return 2 * (width + length);
	}

	public String toString(){
		String str = "Color: " + getColor() + "\n";
		if(isFilled()) str += "Is filled";
		else str += "Isn't filled";
		str += "\nLength: " + getLength();
		str += "\nWidth: " + getWidth();
		return str;
	}
}