package exercices.FunctionalProg.Exercice3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNombre= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listNombre.stream()
                .filter(estPair)
                .map(calculCarre)
        .forEach(System.out::println);
    }

    static Predicate <Integer> estPair=(x)->x%2==0;
    static Function<Integer,Integer> calculCarre=(x)->x*x;
}
