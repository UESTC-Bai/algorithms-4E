public class ch2x2x11 {
    private static int ShortCount = 15;

    public static void merge(Comparable[] aTemp, Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aTemp[j++];
            } else if (j > hi) {
                a[k] = aTemp[i++];
            } else if (less(aTemp[j], aTemp[i])) {
                a[k] = aTemp[j++];
            } else {
                a[k] = aTemp[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
    }

    private static void sort(Comparable[] aTemp, Comparable[] a, int lo, int hi) {
        if (hi - lo < ShortCount) {
            insertionSort(a, lo, hi);
            return; // 小数组直接插入排序
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aTemp, lo, mid);
        sort(a, aTemp, mid + 1, hi);  //*** 交换输入数组 ***
        if (less(aTemp[mid + 1], aTemp[mid])) { //已自然有序的不再进行归并
            merge(aTemp, a, lo, mid, hi);
        }
    }

    public static void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
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
        Integer a[] = new Integer[100];
        for (int i = 0 ; i< 100; i++){
            a[i] = (int)(Math.random()*1000);
        }
        sort(a);
        assert isSorted(a);
        show(a);
    }
}