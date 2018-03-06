public class ch1x1x14 {
    public static int lg(int n ){
        int m=1;
        int i,j;
     for ( i = 1; i < n; i++) {
         m = 2 * m;
         if (m >= n) {
             break;
         }
     }

        if(m>n){
         return i-1;
        }
        else {
            return i;
        }
    }
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int in = StdIn.readInt();
            StdOut.printf("%d", ch1x1x14.lg(in));
        }
    }
}
