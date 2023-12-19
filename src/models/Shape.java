package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double getLongestSide() {
        return 0;
    }

    public double getAverageSide() {
        return 0;
    }
}
