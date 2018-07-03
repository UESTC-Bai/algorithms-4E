import edu.princeton.cs.algs4.Point2D;

import java.util.Scanner;

public class ch1x2x1 {
    public static void main(String[] args) {
        Scanner N1 =new Scanner(System.in);
        int N = N1.nextInt();
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
        if (N > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println("Min distance: " + min);
        }
    }
}
