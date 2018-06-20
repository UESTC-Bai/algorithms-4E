import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.StdDraw;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import java.util.Scanner;
public class ch1x1x31 {
    static class Point{
        double x;
        double y;
        public Point(double x, double y){
            super();
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        double P = in.nextDouble();
        double angle = 360.0/N;
        Point[] point = new Point[N];
        StdDraw.circle(0.5,0.5,0.5);
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < N; i++) {
            point[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180),
                    0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
            StdDraw.point(point[i].x, point[i].y);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(P)) {
                    StdDraw.line(point[i].x, point[i].y, point[j].x, point[j].y);
                }
            }
        }
    }

}
