package exercices.FunctionalProg.Exercice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listClient = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t-----------------Liste des clients-----------------");
        System.out.print("\tCombien de client souhaitez-vous entrer? ");
        int nbre = 0;
        try {
           nbre = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int i = 1;
        while (i <= nbre) {
            System.out.print("\tSaisir le nom du client " + i + ": ");
            listClient.add("Client" + i + ": " + sc.nextLine());
            i++;
        }
        Consumer<String> consumer1 = majuscule -> System.out.println(majuscule.toUpperCase());
        _consumer.accept(listClient,consumer1);
    }

    static BiConsumer<List<String>,Consumer<String>> _consumer = (listChaine,consumer1) -> {
        listChaine.stream()
                .forEach(consumer1);

    };
}
