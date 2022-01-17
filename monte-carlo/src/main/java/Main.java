import java.util.concurrent.TimeUnit;

public class Main {

    private static final int ITERATIONS = 5;

    public static void main(String[] args) {
        MonteCarlo monteCarlo = new MonteCarlo();
        for (int i = 100000; i <= 1000000000; i *= 10) {
            long avgTime = 0;
            for (int j = 0; j < ITERATIONS; j++) {
                long start = System.nanoTime();
                monteCarlo.calculateForN(i);                if (j > 0)
                    avgTime += (System.nanoTime() - start);
            }
            System.out.println(
                    String.format("n: %s, t: %sms", i, TimeUnit.NANOSECONDS.toMillis(avgTime / (ITERATIONS - 1))));
        }
    }
}
