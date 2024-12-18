package ivt5.omgtu.v1;

public class Rectangle extends Point {
    private Point topLeft;
    private Point bottomRight;
    private int xLeft, xRight, yTop, yBottom;

//    public Rectangle(Point leftTop, Point rightBottom){
//        if(x==0 && y==0) //я считаю проверка здесь должна быть обязательно, потому что у нас два конструктора в классе родителе, один ничего не принимает и по умолчанию (0;0)
//            System.out.println("Прямоугольника не существует/данные ввеведыны неверно");
//        else
//            System.out.println("Создан прямогульник c кордами в углах("+ x +" ; "+y+")");
//    }
//    public Rectangle(int xLeft,int yTop, int xRight, int yBottom){
//        this.xLeft = xLeft;
//        this.yTop = yTop;
//        this.xRight = xRight;
//        this.yBottom = yBottom;
//         if(xLeft<xRight && yTop>yBottom)
//             System.out.println("Создан прямогульник c кордами в углах("+ xLeft +" ; "+yTop+ ")"
//                     +"\n("+ xRight +" ; "+yBottom+ ")");
//         else
//             System.out.println("Прямоугольника не существует/данные ввеведыны неверно");
//    }
//    public Rectangle(int lenght, int width){
//        this.xLeft = 0;
//        this.yBottom = 0;
//        this.xRight = lenght;
//        this.yTop = width;
//        System.out.println("Создан прямогульник c кордами в углах("+ xLeft +" ; "+yTop+ ")"
//                +"\n("+ xRight +" ; "+yBottom+ ")");
//    }
//    public Rectangle(){
//        this.xLeft = 0;
//        this.yBottom = 0;
//        this.xRight = 1;
//        this.yTop = 1;
//        System.out.println("Создан прямогульник c кордами в углах("+ xLeft +" ; "+yTop+ ")"
//                +"\n("+ xRight +" ; "+yBottom+ ")");
//    }
//    public Point getTopLeft(){
//        x = xLeft;
//        y = yTop;
//        return topLeft;
//    }
//    public Point getBottomRight(){
//        x = xRight;
//        y = yBottom;
//        return bottomRight;
//    }
//    public void setTopLeft(Point topLeft){
//        x = xLeft;
//        y = yTop;
//    }
//    public void setBottomRight(Point bottomRight){
//        x = xRight;
//        y = yBottom;
//    }
//    public int getLenght(){
//        //как я понял возвращает расстояние между тчоками по оси икс
//        return bottomRight.getX() - topLeft.getX();
//    }
//    public int getWidth() {
//        return bottomRight.getY() - topLeft.getY();
//    }
//
//
//}
    public Rectangle(Point leftTop, Point rightBottom) {
        this.topLeft = leftTop;
        this.bottomRight = rightBottom;
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) { // как я понял, он как-то должен быть наследован в колор ректангл
        this.topLeft = new Point(xLeft, yTop);
        this.bottomRight = new Point(xRight, yBottom);
    }

    public Rectangle(int length, int width) {
        this.topLeft = new Point(0, 0);
        this.bottomRight = new Point(length, width);
    }

    public Rectangle() {
        this(1, 1);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    public int getWidth() {
        return bottomRight.getY() - topLeft.getY(); // я чего-то тут упускаю? он у меня ругается на него
    }

    public void moveTo(int x, int y) {
        int width = getWidth();
        int height = getLength();
        topLeft = new Point(x, y);
        bottomRight = new Point(x + width, y + height);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(topLeft.getX() + dx, topLeft.getY() + dy);
    }

    public void resize(double ratio) {
        int newLength = (int)(getLength() * ratio);
        int newWidth = (int)(getWidth() * ratio);
        bottomRight = new Point(topLeft.getX() + newLength, topLeft.getY() + newWidth);
    }

    public void stretch(double xRatio, double yRatio) {
        int newLength = (int)(getLength() * xRatio);
        int newWidth = (int)(getWidth() * yRatio);
        bottomRight = new Point(topLeft.getX() + newLength, topLeft.getY() + newWidth);
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public boolean isInside(int x, int y) {
        return (x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= topLeft.getY() && y <= bottomRight.getY());
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        return (topLeft.getX() <= rectangle.bottomRight.getX() &&
                bottomRight.getX() >= rectangle.topLeft.getX() &&
                topLeft.getY() <= rectangle.bottomRight.getY() &&
                bottomRight.getY() >= rectangle.topLeft.getY());
    }

    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.topLeft) && isInside(rectangle.bottomRight);
    }

}

