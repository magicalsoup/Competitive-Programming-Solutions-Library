package Douwei;
import java.util.*;

public class NickAndMoriarty {
    // Numbers of adjacent faces listed in counterclockwise order
    public static final int[][] adjacentFaces = { { 1, 4, 3, 5 }, { 2, 4, 0, 5 }, { 3, 4, 1, 5 }, { 0, 4, 2, 5 },
            { 1, 2, 3, 0 }, { 1, 0, 3, 2 } };
 
    // Relative rotation of faces to other adjacent faces
    public static final int[][] rotation = { { -1, 0, -1, 0, 0, 0 }, { 0, -1, 0, -1, 3, 1 }, { -1, 0, -1, 0, 2, 2 },
            { 0, -1, 0, -1, 1, 3 }, { 0, 1, 2, 3, -1, -1 }, { 0, 3, 2, 1, -1, -1 } };
 
    public static int xm;
    public static int ym;
    public static int zm;
    public static Face[] faces;
    public static Point start;
    public static double best;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int p = in.nextInt();
        for (int i = 0; i < p; i++) {
            xm = in.nextInt();
            ym = in.nextInt();
            zm = in.nextInt();
 
            // Initialize all 6 faces of the prism
            faces = new Face[6];
            faces[0] = new Face(0, 0, xm, zm);
            faces[1] = new Face(0, 0, ym, zm);
            faces[2] = new Face(0, 0, xm, zm);
            faces[3] = new Face(0, 0, ym, zm);
            faces[4] = new Face(0, 0, xm, ym);
            faces[5] = new Face(0, 0, xm, ym);
 
            // Add the start to its appropriate face
            Point p1 = new Point(0, 0);
            int startFace = processPoint(in.nextInt(), in.nextInt(), in.nextInt(), p1);
            faces[startFace].start = p1;
 
            // Add the end to its appropriate face
            Point p2 = new Point(0, 0);
            int endFace = processPoint(in.nextInt(), in.nextInt(), in.nextInt(), p2);
            faces[endFace].end = p2;
 
            // Brute force all possible rotations of the start face
            best = Double.POSITIVE_INFINITY;
            for (int j = 0; j < 4; j++) {
                bruteForce(startFace, j, 0, 0, 0);
            }
 
            System.out.printf("Universe #%d: %.2f%n", i + 1, best);
        }
    }
 
    public static void bruteForce(int face, int dir, int dx, int dy, int depth) {
        // We can stop recursing after 6 steps
        if (depth == 6) {
            return;
        }
 
        // Perform all the necessary rotations and translations to the current
        // face
        Face currentFace = faces[face];
        for (int i = 0; i < dir; i++) {
            currentFace = currentFace.rotate();
        }
 
        currentFace = currentFace.translate(dx, dy);
 
        // Update the start location
        if (depth == 0) {
            start = currentFace.start;
        }
 
        // Check for a new best path
        if (currentFace.end != null) {
            best = Math.min(best, distance(start, currentFace.end));
        }
 
        // Try moving right or up on face and recurse
        for (int i = 0; i <= 1; i++) {
            // Calculate the next face, its rotation, and its location relative
            // to the origin
            int newFace = adjacentFaces[face][(-dir + i + 4) % 4];
            int newDir = (dir + rotation[face][newFace]) % 4;
 
            int ndx = currentFace.x2;
            int ndy = currentFace.y1;
            if (i == 1) {
                ndx = currentFace.x1;
                ndy = currentFace.y2;
            }
 
            bruteForce(newFace, newDir, ndx, ndy, depth + 1);
        }
    }
 
    // Find the face that the point is on and add its modified coordinates to a
    // new point
    public static int processPoint(int x, int y, int z, Point point) {
        if (y == 0) {
            point.x = x;
            point.y = z;
            return 0;
        } else if (x == xm) {
            point.x = y;
            point.y = z;
            return 1;
        } else if (y == ym) {
            point.x = xm - x;
            point.y = z;
            return 2;
        } else if (x == 0) {
            point.x = ym - y;
            point.y = z;
            return 3;
        } else if (z == zm) {
            point.x = x;
            point.y = y;
            return 4;
        } else {
            point.x = x;
            point.y = ym - y;
            return 5;
        }
    }
 
    // Calculate the distance between two points
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
 
    static class Face {
        int x1;
        int y1;
        int x2;
        int y2;
        Point start;
        Point end;
 
        public Face(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            start = null;
            end = null;
        }
 
        // Rotate the face and all points on it. This method assumes that the
        // face
        // has not been translated
        public Face rotate() {
            Face newFace = new Face(0, 0, y2, x2);
 
            if (start != null) {
                newFace.start = start.rotate(x2, y2);
            }
 
            if (end != null) {
                newFace.end = end.rotate(x2, y2);
            }
 
            return newFace;
        }
 
        // Move the face by a certain change in x and y values
        public Face translate(int dx, int dy) {
            Face newFace = new Face(x1 + dx, y1 + dy, x2 + dx, y2 + dy);
 
            if (start != null) {
                newFace.start = start.translate(dx, dy);
            }
 
            if (end != null) {
                newFace.end = end.translate(dx, dy);
            }
 
            return newFace;
        }
    }
 
    static class Point {
        int x;
        int y;
 
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
        // Rotate the point inside a rectangle with side lengths xm and ym
        public Point rotate(int xm, int ym) {
            return new Point(ym - y, x);
        }
 
        // Translate the point by the specified amount
        public Point translate(int dx, int dy) {
            return new Point(x + dx, y + dy);
        }
    }
