/**
 * ch2.3.15
 */

public class NutsAndBoltsMatch {
    private static int less(int v, int w) {
        return v-w;
    }

    private static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    private static int partition(int[] a, int lo, int hi, int key){
        while (lo != hi){
            if (less(a[lo],key)<0){
                lo++;
            }
            else if (less(a[lo],key) == 0){
                exch(a, lo, lo+1);
            }
            else {
                exch(a, lo, hi);
                hi--;
            }
        }
        return hi;
    }

    public static void NBmatch(int[] Nuts, int[] Bolts){
        //StdRandom.shuffle(Nuts);
        //StdRandom.shuffle(Bolts);
        NBmatch(Nuts, Bolts, 0, Nuts.length -1 );
    }

    private static void NBmatch(int[] Nuts, int[] Bolts, int lo, int hi){
        if(hi <= lo){
            return;
        }
        int key = partition(Nuts, lo, hi, Bolts[hi]);
        partition(Bolts, lo, hi, Nuts[key]);
        NBmatch(Nuts, Bolts, lo, key-1);
        NBmatch(Nuts, Bolts, key+1, hi);
    }
    public static void main(String[] args){
        int[] Nuts ={5,4,8,7,6,1,9,3,2};
        int[] Bolts = {8,2,5,3,6,9,4,1,7};
        NBmatch(Nuts,Bolts);
        show(Nuts);
        System.out.println();
        show(Bolts);
    }
}
