public class ch2x2x10 {
    private static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = hi;
        for (int k = lo; k <= mid; k++) {
            aux[k] = a[k];
        } // 将前半数组置入aux中
        for (int k = mid + 1; k <= hi; k++) {
            aux[k] = a[(hi - k) + (mid + 1)];
        }//后半数组
        for (int k = lo; k <= hi; k++) {
            if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j--];
            }
        }
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;  //自顶至下依次分开，最后依次递归合并
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
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

        Integer a[] = new Integer[100];
        for (int i = 0 ; i< 100; i++){
            a[i] = (int)(Math.random()*1000);
        }

        //String a[] = new In().readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}