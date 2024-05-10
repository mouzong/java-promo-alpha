package Training_yann.PF.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class MenuApp {
    public static int menuPrincipal(Scanner sc) {
        int menuChoisi = 0;
        System.out.println("\u001B[32m---Bienvenu à mkEvents---\u001B[00m\n------------------------\n" + "1. " + Menu.Facturation.getDisplayName() + "\n" + "2. " + Menu.Gestion_du_stock.getDisplayName() + "\n" + "3. " + Menu.Suivi_de_la_clientele.getDisplayName() + "\n" + "4. " + Menu.Gestion_des_utilisateurs.getDisplayName() + "\n" + "5. " + Menu.Sortir.getDisplayName());
        System.out.println("------------------------");
        System.out.print("Sélectionnez un module: ");
        try {
            menuChoisi = sc.nextInt();
            sc.nextLine();
            while (menuChoisi < 1 || menuChoisi > 4) {
                System.out.print("Sélectionnez un module: ");
                menuChoisi = sc.nextInt();
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("\u001B[31mSaisie incorrect, Erreur interne: " + e.getMessage() + "\u001B[00m");
        }
        return menuChoisi;
    }

    int menuFactureChoisi = menuPrincipal(new Scanner(System.in));


    public static Function<Integer, Map<String, Integer>> menuFacture = (menuFactureChoisi) -> {
        int choix1 = 0;
        Scanner sc1 = new Scanner(System.in);
        Map<String, Integer> menuChoix = new HashMap<>();
        switch (menuFactureChoisi) {
            case 1:
                System.out.println("-----Gestion des factures-----");
                System.out.println("1. " + MenuFacture.Ajouter.getNameFacture());
                System.out.println("2. " + MenuFacture.Consulter.getNameFacture());
                System.out.println("3. " + MenuFacture.Regler.getNameFacture());
                System.out.println("-------------------------------");
                System.out.print("Quelle opération souhaitez-vous effectuer: ");
                try {
                    choix1 = sc1.nextInt();
                    while (choix1 < 1 || choix1 > 3) {
                        System.out.print("Quelle opération souhaitez-vous effectuer: ");
                        choix1 = sc1.nextInt();
                    }
                    menuChoix.put("Facture", choix1);
                } catch (Exception e) {
                    System.out.println("\u001B[31mSaisie incorrect, Erreur interne: " + e.getMessage() + "\u001B[00m");
                }
                break;
            case 2:
                System.out.println("-----Gestion des articles-----");
                System.out.println("1. " + MenuArticle.Ajouter.getNameArticle());
                System.out.println("2. " + MenuArticle.Consulter.getNameArticle());
                System.out.println("-------------------------------");
                System.out.print("Quelle opération souhaitez-vous effectuer: ");
                try {
                    choix1 = sc1.nextInt();
                    while (choix1 < 1 || choix1 > 2) {
                        System.out.print("Quelle opération souhaitez-vous effectuer: ");
                        choix1 = sc1.nextInt();
                    }
                    menuChoix.put("Stock", choix1);
                } catch (Exception e) {
                    System.out.println("\u001B[31mSaisie incorrect, Erreur interne: " + e.getMessage() + "\u001B[00m");
                }
                break;
            case 3:
                System.out.println("-----Gestion des clients-----");
                System.out.println("1. " + MenuClient.Ajouter.getNameClient());
                System.out.println("2. " + MenuClient.Consulter.getNameClient());
                System.out.println("3. " + MenuClient.Modifier.getNameClient());
                System.out.println("4. " + MenuClient.Supprimer.getNameClient());
                System.out.println("-------------------------------");
                System.out.print("Quelle opération souhaitez-vous effectuer: ");
                try {
                    choix1 = sc1.nextInt();
                    while (choix1 < 1 || choix1 > 3) {
                        System.out.print("Quelle opération souhaitez-vous effectuer: ");
                        choix1 = sc1.nextInt();
                    }
                    menuChoix.put("Client", choix1);
                } catch (Exception e) {
                    System.out.println("\u001B[31mSaisie incorrect, Erreur interne: " + e.getMessage() + "\u001B[00m");
                }
                break;
        }
        return menuChoix;
    };


}

