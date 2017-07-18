import java.util.ArrayList;
import java.util.List;

/**
 * Created by kulkarmu on 7/17/2017.
 */
public class PrimeNumber {

    public static List<Integer> generate(int n) {

        boolean flag = false;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        if (n >= 2)
            primeNumbers.add(2);

        else
            return primeNumbers;

        for (int j = 3; j <= n; j = j + 2) {
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                primeNumbers.add(j);
            else
                flag = false;
        }
        return primeNumbers;
    }
}
