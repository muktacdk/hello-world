/**
 * Created by kulkarmu on 7/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayManipulationService.manipulate(new int[]{1, 2, 3, 4, 5}, (int[] arr) -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        });
    }

}
