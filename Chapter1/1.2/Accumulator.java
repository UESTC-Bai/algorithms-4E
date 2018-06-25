

public class Accumulator {
    private double totalnumber;
    private int n;
    public Accumulator(double total2 ,int num2){
        totalnumber = total2;
        n = num2;
    }

    public void addDataValue(double var){
        totalnumber += var;
        n += 1;
    }
    public double mean(){
        double average = totalnumber/n;
        return average;
    }

    @Override
    public String toString() {
        return "Total:"+n+"\nnumbers:"+String.format("%7.5f",mean());
    }
    //测试用例
    public static void main(String[] args){
    double total1 = Double.parseDouble(args[0]);
    int num1 = Integer.parseInt(args[1]);
    double n1 = Double.parseDouble(args[2]);
    double n2 = Double.parseDouble(args[3]);
    double n3 = Double.parseDouble(args[4]);
    Accumulator AC1 = new Accumulator(total1,num1);
    AC1.addDataValue(n1);
    AC1.addDataValue(n2);
    AC1.addDataValue(n3);
    StdOut.println(AC1);

    }
}
