package exercices.FunctionalProg.Exercice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> chaines = Arrays.asList("kwadjio", "rOmeo", "Hello", "World", "Nana", "Test");

        chaines.stream()
                .filter(chaine -> chaine.equals(chaine.toLowerCase()))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
