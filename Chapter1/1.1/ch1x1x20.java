public class ch1x1x20 {
 public static double factorial(int N)
 {
     if (N > 1)
         return Math.log(N)+factorial(N-1);
     return 0;
 }
 public static void main(String[] args){
 StdOut.print(factorial(25));
 }
}
// Have some problem without using Math.