import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.Interval1D;
import java.util.Scanner;
public class ch1x2x3 {
    public static void main(String[] args){
    Scanner New = new Scanner(System.in);
    int N = New.nextInt();
    double min = New.nextDouble();
    double max = New.nextDouble();
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Point2D[] leftTopPoints = new Point2D[N];
        Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] intervals = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, bottom;
            Interval1D x, y;
            if (a < b) {
                left = a;
                right = b;
            } else {
                left = b;
                right = a;
            }
            x = new Interval1D(left, right);
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a < b) {
                top = a;
                bottom = b;
            } else {
                top = b;
                bottom = a;
            }
            y = new Interval1D(top, bottom);
            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);
            intervals[i] = new Interval2D(x, y);
            intervals[i].draw();
        }
        int containNum = 0, intervalNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j > i && intervals[i].intersects(intervals[j])) {
                    intervalNum++;
                }
                if (j != i && intervals[i].contains(leftTopPoints[j]) && intervals[i].contains(rightBottomPoints[j])) {
                    containNum++;
                }
            }
        }
        System.out.println("相交的间隔数量: " + intervalNum);
        System.out.println("有包含关系的间隔数量: " + containNum);
    }
}
