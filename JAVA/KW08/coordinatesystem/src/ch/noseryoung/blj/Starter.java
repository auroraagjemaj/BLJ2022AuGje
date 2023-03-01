package ch.noseryoung.blj;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<CSPoint> points = new ArrayList<>();
        CSPoint csPoint1 = new CSPoint(120, -30);
        CSPoint csPoint2 = new CSPoint(56, -10);
        points.add(csPoint1);
        points.add(csPoint2);
        CoordinateSystem coordinateSystem = new CoordinateSystem(points, 700);
        ArrayList<CSLineSegment> lines = coordinateSystem.getListlines();
        CSLineSegment csLineSegment1 = new CSLineSegment(csPoint1, csPoint2);
        lines.add(csLineSegment1);
        CSRenderer csRenderer = new CSRenderer(coordinateSystem);

    }
}


