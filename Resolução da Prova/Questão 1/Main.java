public class Main
{
    public static void main (String args[]) {
        MovablePoint point = new MovablePoint(1,3,1,1);
        MovableCircle circle = new MovableCircle(1,3,1,1,5);

        System.out.println("\nInfo ponto: \n" + point);
        System.out.println("\nInfo circle: \n" + circle);

        point.moveDown();
        point.moveRight();
        point.moveDown();
        point.moveRight();
        point.moveDown();

        circle.moveUp();
        circle.moveLeft();
        circle.moveUp();
        circle.moveLeft();
        circle.moveUp();

        System.out.println("-----------------");
        System.out.println("\nInfo ponto: \n" + point);
        System.out.println("\nInfo circle: \n" + circle);
    }
}
