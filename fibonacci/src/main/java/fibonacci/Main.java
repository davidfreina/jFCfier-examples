package fibonacci;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long start = System.nanoTime();
        int n = 45;
        // l name(fibonacci) vars(n,fibonacci) return(fib) timeout(540) memory(128)
        BigInteger fib = fibonacci.calculateNthFibonacci(n);
        // lend
        System.out.println(String.format("n=%s, fib=%s, time=%sms", n, fib, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start)));
    }
}
