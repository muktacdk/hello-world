/**
 * Created by kulkarmu on 7/28/2017.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        CalculatorService.calculate(12, 13, (int num1, int num2) -> {
            System.out.println(num1 + num2);
        });

        CalculatorService.calculate(12, 13, (int num1, int num2) -> {
            System.out.println(num1 - num2);
        });
    }

}
