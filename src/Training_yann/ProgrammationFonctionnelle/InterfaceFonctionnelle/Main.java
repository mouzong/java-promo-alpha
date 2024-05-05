package Training_yann.ProgrammationFonctionnelle.InterfaceFonctionnelle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> filtreMax=chaine->chaine.length();

        System.out.println(filtreMax.apply("Kwadjio"));

        Function<List<String>,List<String>>listClient=list -> {
         return list.stream()
                 .filter(chaine->chaine.length()>4)
                 .sorted()
                 .collect(Collectors.toList());

        };

        List<String> listClient1= Arrays.asList("nana","romeo","kwadjio");
        System.out.println(listClient.apply(listClient1));

    }
}
