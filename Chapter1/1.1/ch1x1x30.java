import java.util.*;
public class ch1x1x30 {
    public static int euclid(int p , int q){
        if(p < q){
            int t = p;
            p = q;
            q = t;
        }
        if (p == 0 || q == 0){
            return 1;
        }
        if (p % q ==0){
            return q;
        }else{
            return euclid(q , p%q);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = euclid(i, j) == 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
