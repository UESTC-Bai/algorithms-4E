import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ch1x4x12 {
    public static ArrayList<Integer> PublicNumbers(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> same = new ArrayList<Integer>();
        for (int i = 0;i < a.length;i++)
            for (int j = 0;j < b.length;j++)
                if (a[i] == b[j]){
                    same.add(a[i]);
                    break;
                }
        HashSet hSet = new HashSet(same);
        same.clear();
        same.addAll(hSet);
        return same;
    }
    public static void main(String[] args){
    int[] a = {1,1,2,3,4,5,5,6,7,8};
    int[] b = {1,3,4,6,8,9};
    ArrayList<Integer> same= PublicNumbers(a,b);
    System.out.println(same);
    }
}

