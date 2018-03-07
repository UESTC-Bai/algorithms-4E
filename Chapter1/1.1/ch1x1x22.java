import java.util.Arrays;
public class ch1x1x22
{
    public static int rank(int key ,int[] a)
    {
        return rank(key, a, 0, a.length - 1, 0);
    }
    public static int rank(int key, int[] a, int lo, int hi, int indent)
    {
        StdOut.printf("%s%-4d%d\n", repeat(4*indent, ' '), lo, hi);

        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1, indent + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, indent + 1);
        else                   return mid;
    }
    private static String repeat(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
            s += c;
        return s;
    }

    public static void main(String[] args)
    {
        int[] whitelist = new int[30];
        for (int i=0 ;i<30;i++)
            whitelist[i]=StdRandom.uniform(100);

        Arrays.sort(whitelist);
        for (int i=0 ;i<30;i++)
            StdOut.println(whitelist[i]);
        // read key; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
