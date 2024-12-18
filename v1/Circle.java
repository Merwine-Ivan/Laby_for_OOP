package ivt5.omgtu.v1;

public class Circle extends Point {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, int radius) {
        this(new Point(xCenter, yCenter), radius);
    }

    public Circle(int radius) {
        this(new Point(0, 0), radius);
    }

    public Circle() {
        this(1);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveTo(int x, int y) {
        center = new Point(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(center.getX() + dx, center.getY() + dy);
    }

    public void resize(double ratio) {
        radius = (int)(radius * ratio);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(int x, int y) {
        return (Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2) <= radius * radius);
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
