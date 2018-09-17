public class ch2x3x5 {
    private static int less(Comparable v, Comparable w) {
        return v.compareTo(w);
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
            if (less(a[i], a[i - 1] ) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void sort(Comparable[] a){
       // StdRandom.shuffle(a);
        sort(a, 0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        //int i = lo + 1;
        for (int i =lo + 1; i <= hi;){
            if (less(a[i], a[lo]) < 0) {
                exch(a, lo, i);
                lo++;
                i++;
            } else if (less(a[i], a[lo]) > 0) {
                exch(a, i, hi);
                hi--;
            } else {
                i++;
            }
        }
    }


    public static void main(String[] args){
        String[] a = new In().readAllStrings();
        sort(a);
        //assert isSorted(a);
        show(a);
    }
}
