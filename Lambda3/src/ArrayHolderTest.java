/**
 * Created by kulkarmu on 7/28/2017.
 */
public class ArrayHolderTest {
    static int[] arr = new int[]{2, 5, 7, 10, 3, 6};
    public static void main(String[] args) {

        ArrayHolder a = new ArrayHolder(arr);

        a.forEach((Integer num) -> {
            System.out.println(num);
        });

        System.out.println("==================");

        a.modify((Integer num) -> {
            System.out.println(num * 2);
            return num * 2;
        });

        System.out.println("==================");

        a.delete((Integer num) -> num > 6);
        System.out.println("==================");

        a.fold((Integer num1, Integer num2) -> {return num1 + num2;});

    }
}
