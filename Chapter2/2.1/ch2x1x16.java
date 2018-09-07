


import java.util.Arrays;


import static edu.princeton.cs.algs4.StdIn.readAllInts;

public class ch2x1x16 {
    public static boolean check(int[] a){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i ++){
            b[i] = a[i];
        }
        Arrays.sort(a);
        for (int i = 0; i< a.length; i ++){
            if (b[i] != a[i]){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] a = readAllInts();
        check(a);
        System.out.println(a);
    }
}
