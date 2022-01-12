import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        MonteCarlo monteCarlo = new MonteCarlo();
        for (int i = 100000; i <= 1000000000; i *= 10) {
            long start = System.nanoTime();
            monteCarlo.calculateForN(i);
            System.out.println(
                    String.format("n: %s, t: %sms", i, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start)));
        }
    }
}
