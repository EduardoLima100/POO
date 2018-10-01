public class Circle extends Shape {

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
