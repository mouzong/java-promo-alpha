package functionalprog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiantList = List.of(
                new Etudiant("Franck MVONDO","Informatique",4,18,Genre.HOMME),
                new Etudiant("Arthur BRICE","Geographie",5,21,Genre.HOMME),
                new Etudiant("Anne KAMGA","Physique",5,23,Genre.FEMME),
                new Etudiant("Alice MORIN","GRH",3,19,Genre.FEMME)
        );

//        etudiantList.stream()
//                .filter(etudiant -> etudiant.getGenre().equals(Genre.FEMME))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        int nombreCarre = calculCarreFonction.apply(3);
//        System.out.println(calculCarrePuisJouteDeux.apply(3));
//
//        System.out.println(ajouteDeux.apply(2));
//
//        System.out.println(nombreCarre);

        System.out.println(getOldestStudentName.apply(etudiantList));
    }

    static int calculCarre(int x){
        return x * x;
    }

    static int addition(int x, int y){
        return x + 2;
    }

    static Function<Integer, Integer> calculCarreFonction = (x) ->  x * x;
    static BiFunction<Integer, Integer, Integer> multiply = (x,y) ->  x * y;

    static Function<Integer, Integer> ajouteDeux = x -> x + 2;
    static  Function<Integer, Integer> calculCarrePuisJouteDeux =
            calculCarreFonction.andThen(ajouteDeux);

    static Function<List<Etudiant>, String> getOldestStudentName = etudiantList -> {
        List<Etudiant> etudiantsClasse = etudiantList.stream()
                .sorted(Comparator.comparing(Etudiant::getAge).reversed())
                .collect(Collectors.toList());

        return etudiantsClasse.get(0).getNomComplet();
    };

    // TODO: Try a way with max and return a Student directly
//    static Function<List<Etudiant>, Etudiant> getOldestStudent = etudiantList -> etudiantList.stream()
//            .max(Comparator.comparing(Etudiant::getAge))
//            .ifPresent(etudiant -> );
}
