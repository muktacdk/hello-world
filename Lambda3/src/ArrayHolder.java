import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by kulkarmu on 7/28/2017.
 */
public class ArrayHolder {
    static int[] arr;
    public ArrayHolder(int[] arr) {
        this.arr = arr;
    }

    static void forEach(Consumer<Integer> consumer){
        for(int num: arr) {
            consumer.accept(num);
        }
    }
    static void modify(Function<Integer, Integer> function){
        for(int num: arr) {
            function.apply(num);
        }
    }

    static void delete(Predicate<Integer> predicate){
        for(int num: arr) {
            if (predicate.test(num))
                num = 0;
            System.out.println(num);
        }

    }

    static void fold(BiFunction<Integer, Integer, Integer> biFunction){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = biFunction.apply(result, arr[i]);
        }
        System.out.println(result);
    }
}
