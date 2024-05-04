package functionalprog;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(estPair.test(7));
    }

    static Predicate<Integer> estPair = nombre -> nombre % 2 == 0;
}
