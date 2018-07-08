import edu.princeton.cs.algs4.Stack;
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) {  // 一次读取一个字符
            String s = StdIn.readString();
            if (s.equals("(")) {
                ;
            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {  //
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v; 
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s)); //是数字的话就推入操作数栈
            }
        }
        //完成对于有括号的操作后，对剩下的数依顺序进行计算操作
        while (!ops.isEmpty()){
            double vals1 = vals.pop();
            String op1 = ops.pop();
            if (op1.equals("+")) {
                vals1 = vals.pop() + vals1;
            } else if (op1.equals("-")) {
                vals1 = vals.pop() - vals1;
            } else if (op1.equals("*")) {
                vals1 = vals.pop() * vals1;
            } else if (op1.equals("/")) {
                vals1 = vals.pop() / vals1;
            } else if (op1.equals("sqrt")) {
                vals1 = Math.sqrt(vals1);
            }
            vals.push(vals1);
        }

        StdOut.println(vals.pop());
    }
}