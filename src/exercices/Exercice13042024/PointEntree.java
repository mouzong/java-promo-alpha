package exercices.Exercice13042024;


public class PointEntree {
    public static void main(String[] args) {
BoiteOutils restaurant=new BoiteOutils();
        restaurant.afficheMenu();
        int choix = restaurant.choix();
        switch (choix) {
            case 1:
                String[] infosUtilisateur = restaurant.enregUtil();
                // Traiter les informations de l'utilisateur
                System.out.println("\t----------------------------------------");
                System.out.println("\t\u001B[3m\u001B[32mEnregistrement reussi\u001B[0m\n\t----------------------------------------" +
                        "\n\tNom: "+infosUtilisateur[0]+",\n\tPrénom: "+infosUtilisateur[1]+",\n\tFilière: " +
                        ""+infosUtilisateur[2]+".\n\t----------------------------------------");
                break;
            case 2:
                // Logique pour les entrées
                break;
            case 3:
                // Logique pour les plats principaux
                break;
            case 4:
                // Logique pour les desserts
                break;
            case 5:
                // Logique pour commander ou réserver
                break;
            default:
                System.out.println("Choix invalide.");
        }

    }

}
