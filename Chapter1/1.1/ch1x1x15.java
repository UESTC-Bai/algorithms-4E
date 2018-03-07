import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ch1x1x15 {
    public static int[] histogram(int[] a,int M){
        int[] h =new int[M];
        int n = a.length;
        for (int i=0;i<n;i++){
            if (a[i]<M)
                h[a[i]]++;
        }
        return h;
    }

    public static void main(String[] args){
    int M = 100;
    int n = 100;
    int[] a = new int[n];
    for (int i=0;i<n;i++)
        a[i]= StdRandom.uniform(M);
    int[] h = histogram(a,M);
    for (int i=0;i<n;i++)
        StdOut.println(a[i]);
    for (int i=0;i<M;i++)
        StdOut.println(h[i]);
    int sum = 0;
    for(int i=0;i<M;i++)
            sum = sum + h[i];
        StdOut.print(sum);
    }

}
