package ivt5.omgtu.v3;

public class Rectangle extends Figure {
    private Point topLeft;
    private Point bottomRight;
    private int xLeft, xRight, yTop, yBottom;
public Rectangle(){
    super(new Point(1,1));
    this.topLeft=new Point(0,0);
}

public Rectangle(Point leftTop, Point rightBottom){
    super(rightBottom);
    this.topLeft=leftTop;
}

public Rectangle(int xLeft,int yTop,int xRight,int yBottom){
    super(new Point(xRight,yBottom));
    this.topLeft = new Point(xLeft,yTop);
}

public Rectangle(int length,int width){
    super(new Point(length,0));
    this.topLeft = new Point(0,width);
}

public int getLength(){
    return getPointTopLeft().getX() - topLeft.getX()  ;
}

public int getWidth(){
    return topLeft.getY() - getPointTopLeft().getY() ;
}

public double getArea(){
    return getLength() * getWidth();
}

public double getPerimeter(){
    return 2*getLength()+2*getWidth();
}


public void moveTo(int x,int y){
    this.topLeft=new Point(x,y);
    setPointTopLeft(new Point(x+getLength(),y+getWidth()));
}

    @Override
    public void moveTo(ivt5.omgtu.v2.Point point) {

    }

    public void moveTo(Point point) {
    this.topLeft = point;
    setPointTopLeft( new Point(point.getX()+getLength(),point.getY()+getWidth()));
}

public void moveRel(int dx, int dy) {
    moveTo(topLeft.getX() + dx, topLeft.getY() + dy);
}

public boolean isInside(int x, int y) {
    return x >= topLeft.getX() && x <= getPointTopLeft().getX() &&
            y >= topLeft.getY() && y <= getPointTopLeft().getY();
}

public boolean isInside(Point point) {
    return isInside(point.getX(), point.getY());
}

public boolean isIntersects(Rectangle square) {
    Point thisBottomRight = getBottomRight();
    Point otherBottomRight = square.getBottomRight();

    return !(this.topLeft.getX() > otherBottomRight.getX() ||
            thisBottomRight.getX() < square.topLeft.getX() ||
            this.topLeft.getY() > otherBottomRight.getY() ||
            thisBottomRight.getY() < square.topLeft.getY());
}

public boolean isInside(Rectangle rectangle) {
    Point thisBottomRight = getBottomRight();
    Point otherBottomRight = rectangle.getBottomRight();

    return this.topLeft.getX() >= rectangle.topLeft.getX() &&
            thisBottomRight.getX() <= otherBottomRight.getX() &&
            this.topLeft.getY() >= rectangle.topLeft.getY() &&
            thisBottomRight.getY() <= otherBottomRight.getY();
}

public void setTopLeft(Point leftTop){
    this.topLeft = leftTop;
}

public void setBottomRight(Point rightBottom){
    setPointTopLeft(rightBottom);
}

public Point getTopLeft(){
    return topLeft;
}

public Point getBottomRight(){
    return getPointTopLeft();
}

    public void resize(double ratio) {

    }
    public void stretch(double xRatio, double yRatio) {

    }
}