public class date {
    private int month;
    private int day;
    private int year;

    public date (int m,int d ,int y){
        month = m;
        day = d;
        year = y;
    }
    public int month(){
        return month;
    }
    public int day(){
        return day;
    }
    public int year(){
        return year;
    }

    @Override
    public String toString() {
        return month()+"/"+day()+"/"+year();
    }
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[0]);
        date date = new date(m,d,y);
        StdOut.println(date);
    }
}
