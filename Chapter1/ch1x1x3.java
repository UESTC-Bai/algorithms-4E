public class ch1x1x3 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int i;
        while (!StdIn.isEmpty()) {
            for (i = 0; i < 3; i++) {
                a[i] = StdIn.readInt();
            }
        }
        if (a[0] == a[1] && a[1] == a[2]) {
            StdOut.printf("equal");
        } else {
            StdOut.printf("not equal");
        }
    }
}
