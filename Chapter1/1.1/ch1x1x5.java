public class ch1x1x5 {
    public static void main(String[] args){
        double[] a = new double[2];
        int i;
        while (!StdIn.isEmpty()){
            for (i=0;i<2;i++){
                a[i]=StdIn.readDouble();
            }
        }
        if (a[0] < 1 && a[0] > 0 && a[1] < 1 && a[0] > 0 ){
            StdOut.printf("true");
        }
        else{
            StdOut.printf("Faluse");
        }
    }
}
