import edu.princeton.cs.algs4.Stack;
public class ch1x3x9
{
    public static void main(String[] args){
    Stack<String> Stack = new Stack<String>();
    while (!StdIn.isEmpty()){
        String s = StdIn.readString();
        if (s.equals("(")){
            Stack.push(s);
        }
        else if (s.equals(")")){
            String v1 = Stack.pop();
            String v2 = Stack.pop();
            String v = "";
            if (v2.equals("sqrt")){
                v = String.format("%s %s %s %s","(",v2,v1,")");
            }
            else {
                v = String.format("%s %s %s %s %s","(",Stack.pop(),v2,v1,")");
            }
            Stack.push(v);
        }
        else{
            Stack.push(s);
        }
    }
    StdOut.println(Stack.size());
    StdOut.println(Stack.pop());

    }
}
