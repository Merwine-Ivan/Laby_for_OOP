package ivt5.omgtu.v3;


public class Point {
    public int x = 0, y = 0;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void projectToX(){
        this.y = 0;
    }

    public Point() {
        setX(4);
        setY(5);
        getX();
        getY();
        moveTo(10, 15);
        moveRel(4, 4);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveTo(int newX, int newY) {

        this.x = newX;
        this.y = newY;
    }

    public void moveRel(int dx, int dy) {

        this.x += dx;
        this.y += dy;

    }
}