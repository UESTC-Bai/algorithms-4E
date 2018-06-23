public class ch1x1x35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            } //2-12 11种可能的情况，每种组合的结果是其中一种，若是则加1
        }
        System.out.print("Probability:");
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
            System.out.printf("%6.3f", dist[k]);
        }//得的结果的次数与总的36种组合的比就是概率（默认36种组合概率相等）
        System.out.println();
        int[] num = new int[2 * SIDES + 1];
        //int N = StdIn.readInt();
        boolean isAccurate = true;
        int N = 0;
        double frequency;
        while(isAccurate){
            N++;
            for (int i = 0; i < N; i++) {
                    num[StdRandom.discrete(dist)]++;
            }//投掷N次骰子,每次对应的结果加一
            System.out.print("Frequency:");
            System.out.println();
            for (int i = 2; i <= 2 * SIDES; i++) {
                frequency = (double) num[i] / N;
                System.out.printf("%6.3f", frequency);
                if (Math.abs(frequency - dist[i]) <= 0.001) {
                    isAccurate = false;//和期望概率的差值，直到满足的退出循环
                }
            }

        }

        System.out.println();
        System.out.println("N is"+N);
        System.out.println("Is accurate? " + !isAccurate);
    }
}
