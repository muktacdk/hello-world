import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kulkarmu on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void checkPrime() {
        List<Integer> expected = Arrays.asList(2);
        Assert.assertEquals("Expected output is list [2]", expected, PrimeNumber.generate(2));

        List<Integer> expected1 = Arrays.asList();
        Assert.assertEquals("Expected output is empty list", expected1, PrimeNumber.generate(1));

        List<Integer> expected2 = Arrays.asList(2, 3, 5, 7, 11);
        Assert.assertEquals("Expected output is list [2, 3, 5, 7, 11]", expected2, PrimeNumber.generate(12));

        List<Integer> expected3 = Arrays.asList();
        Assert.assertEquals("Expected output is list [2]", expected3, PrimeNumber.generate(-1));
    }
}
