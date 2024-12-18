package ivt5.omgtu.v3.iface;

import ivt5.omgtu.v3.colors.Color;
import ivt5.omgtu.v3.colors.ColorException;


public interface Colored {
        void setColor(Color color) throws ColorException;
        int getColor();

}
