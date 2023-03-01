package ch.noseryoung.blj;
import java.util.ArrayList;
public class CoordinateSystem {
    ArrayList<CSPoint> listPoints = new ArrayList<>();
    ArrayList<CSLineSegment> listLines = new ArrayList<>();

    int coordinateSystemSize;

    public CoordinateSystem(ArrayList<CSPoint> Point, int coordinateSystemSize) {
        this.coordinateSystemSize = coordinateSystemSize;
        listPoints = Point;
    }

    public void addPoints(CSPoint point) {
        listPoints.add(point);
    }

    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public ArrayList<CSPoint> getAllPoints() {
        return listPoints;
    }
    public ArrayList<CSLineSegment> getListlines(){
        return listLines;
    }
}

