import java.math.BigDecimal;
import java.util.Random;

public class MonteCarlo {

    public void calculateForN(int n) {
        int inner = 0;
        int outer = 0;
        final Random rand = new Random(123456);

        // l name(montecarlo) vars(n,rand,inner,outer) return(inner,outer) timeout(540)
        for (int i = 0; i < n; i++) {

            double rand1 = rand.nextDouble();
            double rand2 = rand.nextDouble();

            if (Math.pow(rand1, 2) + Math.pow(rand2, 2) <= 1)
                inner++;
            else
                outer++;
        }
        // lend

        BigDecimal piApprox = BigDecimal.valueOf(4.0 * ((double) inner / ((double) inner + (double) outer)));
    }
}