package ivt5.omgtu.v1;

public class Ellipse extends Point {
    private Point center;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this(new Point(xCenter, yCenter), xAxis, yAxis);
    }

    public Ellipse(int xAxis, int yAxis) {
        this(new Point(0, 0), xAxis, yAxis);
    }

    public Ellipse() {
        this(1, 1);
    }

    public Point getCenter() {
        return center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void setCenter(Point center) {
        this.center = center;
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
        xAxis = (int)(xAxis * ratio);
        yAxis = (int)(yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        xAxis = (int)(xAxis * xRatio);
        yAxis = (int)(yAxis * yRatio);
    }

    public double getArea() {
        return Math.PI * xAxis * yAxis;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((xAxis * xAxis + yAxis * yAxis) / 2);
    }

    public boolean isInside(int x, int y) {
        return (Math.pow((x - center.getX()) / (double)xAxis, 2) + Math.pow((y - center.getY()) / (double)yAxis, 2) <= 1);
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
