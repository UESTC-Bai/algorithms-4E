public class ch2x1x11 {
    public static void sort(Comparable[] a) {
        int N = a.length;
        /*
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
        */
        int[] h = new int[N];
        int h1 = 1;
        h[0] = 1;
        for (int i = 1; i < N; i++){
            h[i] = h[i-1] * 3 + 1;
        }
        int n = h.length;

        while (n -1 >= 1) {
            for (int i = h[n-1]; i < N; i++) {
                for (int j = i; j >= h[n-1] && less(a[j], a[j - h[n-1]]); j -= h[n-1]) {
                    exch(a, j, j - h[n-1]);
                }
            }
            n = n -1;
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = new In().readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
