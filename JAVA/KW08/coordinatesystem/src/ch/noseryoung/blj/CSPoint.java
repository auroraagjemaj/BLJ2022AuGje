package ch.noseryoung.blj;
import java.awt.*;
public class CSPoint extends Point {
    private int IDPoint = 0;
    static int IDCounter = 0;
    public CSPoint(int x, int y) {
        this.IDPoint = IDCounter;
        IDCounter ++;
        this.x= x;
        this.y= y;
    }
    public String toString() {
return "[ ID = " + IDPoint + " x= " + x + ", y=" + y + "]";
    }
}

