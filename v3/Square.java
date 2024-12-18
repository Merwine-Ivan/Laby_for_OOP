package ivt5.omgtu.v3;

public class Square extends Figure {
    private int length;

    public Square() {
        super(new Point(0,0));
        this.length = 1;
    }


    public Square(Point leftTop, Point rightBottom) {
        super(leftTop);
        this.length = rightBottom.getX() - leftTop.getX();
    }


    public Square(int xLeft, int yTop, int length) {
        super(new Point(xLeft, yTop));
        this.length = length;
    }


    public Square(Point topLeft, int length) {
        super(topLeft);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return length * length; // Площадь квадрата
    }

    public double getPerimeter() {
        return 4 * length; // Периметр квадрата
    }

    public void moveTo(int x, int y) {
        setPointTopLeft(new Point(x, y));
    }

    @Override
    public void moveTo(ivt5.omgtu.v2.Point point) {

    }


    public void moveRel(int dx, int dy) {
        moveTo(getPointTopLeft().getX() + dx, getPointTopLeft().getY() + dy);
    }

    public boolean isInside(int x, int y) {
        Point currentPoint = getPointTopLeft();
        return x >= currentPoint.getX() && x <= currentPoint.getX() + length
                && y >= currentPoint.getY() && y <= currentPoint.getY() + length;
    }

    public Point getTopLeft() {
        return getPointTopLeft();
    }

    public Point getBottomRight() {
        Point currentPoint = getPointTopLeft();
        return new Point(currentPoint.getX() + length, currentPoint.getY() + length);
    }

    public void resize(double ratio) {

    }
    public void stretch(double xRatio, double yRatio) {

    }
}