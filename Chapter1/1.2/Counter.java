import edu.princeton.cs.algs4.StdRandom;

    public class Counter implements Comparable<Counter> {

        private final String name;     // counter name
        private int count;             // current value

        // create a new counter
        public Counter(String id) {
            name = id;
        }

        // increment the counter by 1
        public void increment() {
            count++;
        }

        // return the current count
        public int tally() {
            return count;
        }

        // return a string representation of this counter
        public String toString() {
            return count + " " + name;
        }

        // compare two Counter objects based on their count
        public int compareTo(Counter that) {
            if      (this.count < that.count) return -1;
            else if (this.count > that.count) return +1;
            else                              return  0;
        }
//使用翻硬币来进行测试
        public static void main(String[] args){
            int T = 100;
            Counter heads = new Counter("heads");
            Counter tails = new Counter("tails");
            for (int t = 0;t < T;t++){
                if (StdRandom.bernoulli(0.5)){
                    heads.increment();}
                else{ tails.increment(); }
            StdOut.println(heads);//to string 调用
            StdOut.println(tails);
            int d = heads.tally() - tails.tally();
            StdOut.println("delta:"+Math.abs(d));
            }
        }
    }
