public class ch1x1x13 {

    public static void main(String[] args){
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        for(int i=0;i < 10; i++){
            for (int j=0;j < 10; j++){
                a[i][j] = StdRandom.uniform(100);
            }
        }
        for(int i=0;i < 10; i++){
            for (int j=0;j < 10; j++){
                StdOut.printf("%d\t",a[i][j]);
            }
            StdOut.printf("\n");
        }
        StdOut.printf("\n");

        for(int i=0;i < 10; i++){
            for (int j=0;j < 10; j++){
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i < 10; i++){
            for (int j=0;j < 10; j++){
                StdOut.printf("%d\t",b[i][j]);
            }
            StdOut.printf("\n");
        }
    }

}
