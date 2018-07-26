import edu.princeton.cs.algs4.Stack;

public class ch1x3x10 {
    public static void main(String[] args)
    {
        Stack<String> ops  = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();

            if (s.equals("(")){   //“（”忽略
                continue;
            }
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt")) {
                ops.push(s);    //操作数压栈
            }
            else if (s.equals(")")) {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+") ||
                        op.equals("-") ||
                        op.equals("*") ||
                        op.equals("/"))
                    v = String.format("%s %s %s", vals.pop(), v, op);
                else if (op.equals("sqrt"))
                    v = String.format("%s %s", v, op);   //遇到“）”弹出操作数和相应的计算值，变成新的字符串后压栈

                vals.push(v);
            }
            else vals.push(s);
        }
        StdOut.println(vals.size()); //最终栈中只有最后一个字符，即转变为后序的算术式
        StdOut.println(vals.pop());
    }



}
