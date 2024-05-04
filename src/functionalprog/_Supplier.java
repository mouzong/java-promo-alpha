package functionalprog;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(aleatoireGen.get());
    }

    static Supplier<Double> aleatoireGen = () -> Math.random();
}
