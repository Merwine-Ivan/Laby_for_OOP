package ivt5.omgtu.v1;

public class Square extends Point {
    private Rectangle rectangle;

    public Square(Point leftTop, int size) {
        rectangle = new Rectangle(leftTop, new Point(leftTop.getX() + size, leftTop.getY() + size));
    }

    public Square(int xLeft, int yTop, int size) {
        this(new Point(xLeft, yTop), size);
    }

    public Square(int size) {
        this(new Point(0, 0), size);
    }

    public Square() {
        this(1);
    }

    public Point getTopLeft() {
        return rectangle.getTopLeft();
    }

    public Point getBottomRight() {
        return rectangle.getBottomRight();
    }

    public void setTopLeft(Point topLeft) {
        int size = getLength();
        rectangle.setTopLeft(topLeft);
        rectangle.setBottomRight(new Point(topLeft.getX() + size, topLeft.getY() + size));
    }

    public int getLength() {
        return rectangle.getLength();
    }

    public void moveTo(int x, int y) {
        rectangle.moveTo(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        rectangle.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        rectangle.resize(ratio);
    }

    public double getArea() {
        return rectangle.getArea();
    }

    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    public boolean isInside(int x, int y) {
        return rectangle.isInside(x, y);
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Square square) {
        return rectangle.isIntersects(square.rectangle);
    }

    public boolean isInside(Square square) {
        return rectangle.isInside(square.rectangle);
    }
}

