import java.util.Scanner;
import edu.princeton.cs.algs4.Interval1D;
public class ch1x2x2 {
    public static void main(String[] args){
        Scanner New = new Scanner(System.in);
        int N = New.nextInt();
        double[] a = new double[N];
        double[] b = new double[N];
        Interval1D intercal[] = new Interval1D[N];
        for (int i=0;i<N;i++){
            System.out.println("这是第"+i+"个间隔对：");
            System.out.println("请输入间隔对左端的值");
            a[i] = New.nextDouble();
            System.out.println("请输入间隔对右端的值");
            b[i] = New.nextDouble();
            intercal[i] = new Interval1D(a[i],b[i]);
            System.out.println("第i对间隔为："+intercal[i]);
        }
        for (int k = 0;k < N;k++)
            for (int j = k+1;j < N;j++)
                if (intercal[k].intersects(intercal[j]))
                    System.out.println(intercal[k]+"与"+intercal[j]+"相交");

    }
}
