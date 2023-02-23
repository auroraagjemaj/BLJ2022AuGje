package ch.noseryoung;


import java.awt.*;

public class CSPoint extends Point {

    private Point position;
    private int id;

    public CSPoint() {
        position.setLocation(0, 0);
    }

    public CSPoint(int posX, int posY) {
        position.setLocation(posX, posY);
    }
    public void setId(int id) {
        this.id = id;
    }

}
