package functionalprog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Stream {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nombres.stream()
                .filter(estPair)
                .map(calculCarreFonction)
                .forEach(System.out::println);
    }

    static Predicate<Integer> estPair = nombre -> nombre % 2 == 0;
    static Function<Integer, Integer> calculCarreFonction = (x) ->  x * x;
}
