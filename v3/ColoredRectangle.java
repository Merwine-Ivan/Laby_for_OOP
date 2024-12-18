package ivt5.omgtu.v3;

public class ColoredRectangle extends Rectangle {
    private int xLeft, xRight, yTop, yBottom, color;
    private Point topLeft;
    private Point bottomRight;

   public ColoredRectangle(Point leftTop, Point rightBottom, int color){ //наследуем его от ректангл
       super(leftTop,rightBottom);
       this.color = color;
  }
  public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color){ //не понял, как я могу наследоваьт конструткор из ректангла сюда и можно ли так?
      //this.topLeft = new Point(xLeft, yTop);
      //this.bottomRight = new Point(xRight, yBottom);
      super(xLeft,yTop,xRight,yBottom);
      this.color = color;
      }
    public ColoredRectangle(int length, int width, int color){
        super(length,width);
        this.color = color;
    }
    public ColoredRectangle(int color){
       super();
       this.color = color;
    }
    public ColoredRectangle(){
       super();
       this.color = 1;
    }
    public int getColor(){
       return this.color;
    }
    public void setColor(int color){
       this.color = color;
    }
}
