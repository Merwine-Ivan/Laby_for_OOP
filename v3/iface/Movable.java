package ivt5.omgtu.v3.iface;

import ivt5.omgtu.v2.Point;

public interface Movable {
    void moveTo(int x, int y);
    void moveTo(Point point);
    void moveRel(int dx, int dy);
}
