
import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

public class ch1x4x8 {
    public static int CountEqual(int a[]){
        int n = a.length;
        int count = 0;
        for (int i = 0;i < n;i++)
            for (int j = i;j < n;j++)
                if (a[i] == a[j])
                    count++;
        return count;
    }
    public static int CountEqualLog(int a[]){
        int n = a.length;
        int count =0;
        for (int i = 0;i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (BinarySearch.rank(-a[i]-a[j],a) > j)
                    count++;
        return count;
    }
    public static void main(String[] args){
        int[] a = new In(args[0]).readAllInts();
        StdOut.println(CountEqual(a));
        Arrays.sort(a);
        StdOut.println(CountEqualLog(a));

        StdOut.println(a[4]);

        StdOut.println(a[4]);
    }
}
