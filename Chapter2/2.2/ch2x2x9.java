public class ch2x2x9 {

    public static void merge(Comparable[] a, int lo, int mid, int hi,Comparable[] aux) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        } // 将数组置入aux中
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++]; //越界证明一段已被用完，只移动另一端
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++]; //两端都已排序好，比较将下的放入a[]中，完成归并
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {

        Comparable[] aux = new Comparable[a.length];
        sort(a, 0, a.length - 1, aux);
    }

    private static void sort(Comparable[] a, int lo, int hi, Comparable[] aux) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid, aux);
        sort(a, mid + 1, hi ,aux);
        merge(a, lo, mid, hi ,aux);
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