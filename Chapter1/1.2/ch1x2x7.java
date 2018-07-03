public class ch1x2x7 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) {
            return s;
        }
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        System.out.println(mystery(StdIn.readLine()));
    }
}
/*
123456789
6789 12345
89 67 45 123
9 8 7 6 5 4 3 12
9 8 7 6 5 4 3 2 1
字符串倒序
*/