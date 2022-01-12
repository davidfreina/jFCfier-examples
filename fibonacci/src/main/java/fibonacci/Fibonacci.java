package fibonacci;

import java.math.BigInteger;

public class Fibonacci {
    public BigInteger calculateNthFibonacci(int n) {
        if (n == 0)
            return BigInteger.ZERO;
        else if (n == 1)
            return BigInteger.ONE;

        return calculateNthFibonacci(n - 2).add(calculateNthFibonacci(n - 1));
    }
}
