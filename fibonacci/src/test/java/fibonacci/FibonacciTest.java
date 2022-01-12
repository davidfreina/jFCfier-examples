package fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testFib() {
        int[] n = { 0, 1, 10, 20, 30, 40, 50 };
        BigInteger[] fib = { BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(55), BigInteger.valueOf(6765),
                BigInteger.valueOf(832040), BigInteger.valueOf(102334155), BigInteger.valueOf(12586269025L) };

        for (int i = 0; i < n.length; i++) {
            long start = System.nanoTime();
            Assertions.assertEquals(fib[i], fibonacci.calculateNthFibonacci(n[i]));
            System.out.println(String.format("n=%s, fib=%s, time=%sms", n[i], fib[i],
                    TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start)));
        }

    }
}
