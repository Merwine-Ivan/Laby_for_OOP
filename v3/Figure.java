package ivt5.omgtu.v3;

import ivt5.omgtu.v2.iface.HasArea;
import ivt5.omgtu.v2.iface.Movable;
import ivt5.omgtu.v2.iface.Resizable;
import ivt5.omgtu.v2.iface.Stretchable;

public abstract class Figure implements Movable, HasArea, Stretchable, Resizable {
        private Point pointTopLeft;
        public Figure(Point point){pointTopLeft = point;}

        public Point getPointTopLeft(){return pointTopLeft;}

        public  void setPointTopLeft(Point pointTopLeft) {this.pointTopLeft = pointTopLeft;}

        public void moveTo (Point point){pointTopLeft = point;}

        public abstract  boolean isInside(int x, int y);

        public boolean isInside(Point point) {return false;}

        public abstract double getPerimeter();

       // public abstract double getArea();
       // public abstract void moveTo(int x, int y);
      //  public abstract void moveRel(int dx, int dy);


}
