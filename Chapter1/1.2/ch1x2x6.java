public class ch1x2x6 {
    public static void main(String[] args) {
        System.out.println("s: ");
        String s = StdIn.readLine();
        System.out.println("t: ");
        String t = StdIn.readLine();
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {//连接两个相同的字符串，则若另一个字符串是其循环位移所得则一定在新的字符串中
            System.out.println(s + " is the circular rotation of " + t);
        } else {
            System.out.println(s + " is not the circular rotation of " + t);
        }
    }
}
