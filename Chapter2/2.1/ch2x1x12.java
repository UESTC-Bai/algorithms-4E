public class ch2x1x12 {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        int time = 0;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h , time +=1) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
        System.out.println(time/N);
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
        Double[] a100 = new Double[100];
        for(int i = 0 ; i <a100.length ; i++)
        {
            a100[i] = Math.random();
        }
        sort(a100);

        Double[] a1000 = new Double[1000];
        for(int i = 0 ; i <a1000.length ; i++)
        {
            a1000[i] = Math.random();
        }
        sort(a1000);

        Double[] a10000 = new Double[10000];
        for(int i = 0 ; i <a10000.length ; i++)
        {
            a10000[i] = Math.random();
        }
        sort(a10000);

        Double[] a100000 = new Double[100000];
        for(int i = 0 ; i <a100000.length ; i++)
        {
            a100000[i] = Math.random();
        }
        sort(a10000);

        Double[] a1000000 = new Double[1000000];
        for(int i = 0 ; i <a1000000.length ; i++)
        {
            a1000000[i] = Math.random();
        }
        sort(a1000000);
    }
}
