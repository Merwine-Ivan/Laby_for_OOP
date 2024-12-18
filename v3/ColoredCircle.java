package ivt5.omgtu.v3;

public class ColoredCircle extends Circle {
    private int color;
    public ColoredCircle(Point center, int radius, int color){
        super(center, radius);
        this.color = color;
    }
    public ColoredCircle(int xCenter, int yCenter, int radius, int color){
        super(xCenter, yCenter, radius);
        this.color=color;
    }
    public ColoredCircle(int radius, int color){
        super(radius);
        this.color = color;
    }
    public ColoredCircle(int color){
        super();
        this.color = color;
    }
    public ColoredCircle(){
        super();
        this.color = 1;
    }
    public int getColor(int color){
        return color;
    }
    public void setColor(int color){
        this.color = color;
    }

}
