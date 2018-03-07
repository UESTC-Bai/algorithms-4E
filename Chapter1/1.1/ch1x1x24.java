public class ch1x1x24
{
    public static int euclid(int p, int q) {
        System.out.println("p = " + p +", q = " + q);
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }
    public static void main(String[] args){
      StdOut.printf("result: " + euclid(105, 24));
      StdOut.printf("result: " + euclid(1111111, 1234567));
    }

}
