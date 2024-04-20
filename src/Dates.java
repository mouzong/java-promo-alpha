import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Entrez les informations de votre produit sous " +
                "\n\t la forme nom,date_enregisstrement(AAAA,MM,JJ),date_fin_garantie(AAAA,MM,JJ),quantite,prix : ");

        String produit = sc.nextLine();

        String[] baseDeDonnees = new String[5];

        baseDeDonnees[0] = produit;

        System.out.println("\n\t Produit 1 ::::: "+baseDeDonnees[0]);

//        LocalDateTime fullDateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//
//        System.out.println("\n Date et heure Complete : " + fullDateTime);
//        System.out.println(" Date : " + date);
//        System.out.println(" Heure : " + time);
//
//        LocalDate dateCustom = LocalDate.of(2022,9,5);
//
//        System.out.println("\n Date personnalisée : "+dateCustom);
//
//
//        System.out.println("\n Date complete detaillée : "+fullDateTime.getYear());
    }
}
