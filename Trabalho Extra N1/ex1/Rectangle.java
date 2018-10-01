public class Rectangle extends Shape
{
	protected double width, length;

    public Rectangle(){
        super();
    }

    public Rectangle(double width,double lenght){
        super();
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(double width, double lenght,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
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
