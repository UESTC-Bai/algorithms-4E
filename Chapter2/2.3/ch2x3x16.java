public class ch2x3x16 {
    /**
     * best quick-sort array
     */
    private static void best(int[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++){
            a[i] = i;
        }     //有序数组作为起始

        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        best(a, lo, mid-1);
        best(a, mid+1, hi);
        exch(a, lo, mid); //将每次mid位置的值放入用作key的最低位
    }

    public static int[] best(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = i;
        best(a, 0, n-1);
        return a;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //int n = Integer.parseInt(args[0]);
        int n = 52;
        int[] a = best(n);
        for (int i = 0; i < n; i++)
            // StdOut.println(a[i]);
            StdOut.print(alphabet.charAt(a[i]));
        StdOut.println();
        for (int i = 0; i < n; i++){
            StdOut.print(a[i]);
            StdOut.print(" ");
        }
    }
}
