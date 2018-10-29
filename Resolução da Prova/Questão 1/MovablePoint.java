public class MovablePoint implements Movable
{
    public int x, y, xSpeed, ySpeed;

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
        y += ySpeed;
    }
    void moveDown(){
        y -= ySpeed;
    }
    void moveLeft(){
        x -= xSpeed;
    }
    void moveRight(){
        x += xSpeed;
    }
}
