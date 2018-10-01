public class Main
{
	public static void main(String args[]){
		Circle circle = new Circle(10, "black", true);
        Rectangle rectangle = new Rectangle(5., 7., "red", false);

        circle.setRadius(6);
        rectangle.setWidth(4);
        rectangle.setLength(2);

        System.out.println("\nCircle information:\n" + circle + "\nArea: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
        System.out.println("\nRectangle information:\n" + rectangle + "\nArea: " + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
    }
}
