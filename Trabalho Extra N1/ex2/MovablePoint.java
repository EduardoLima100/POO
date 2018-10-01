public class MovablePoint
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
