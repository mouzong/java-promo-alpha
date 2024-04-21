package poo;

public class MainPOO {
    public static void main(String[] args) {
        Utilisateur user1 = new Utilisateur();
        Utilisateur user_one = new Utilisateur();
        Utilisateur user2 = new Utilisateur("andreas@adacorp.com","admin01");
        Utilisateur user3 = new Utilisateur(
                "MOUZONG",
                "Andreas",
                "andreas@adacorp.com",
                "+237 654 702 565",
                "admin02"
        );

        user1.setUserCode("USER-007");
        System.out.println(user1);

        System.out.println("\n\t User1 nom = "+user1.getNom());
        System.out.println("\n\t User2 nom = "+user2.getNom());
        System.out.println("\n\t User3 nom = "+user3.getNom());

        user1.setNom("KWADJIO");
        user2.setNom("KOUAME");

        System.out.println("\n\t User1 nom = "+user1.getNom());
        System.out.println("\n\t User2 nom = "+user2.getNom());
        System.out.println("\n\t User3 nom = "+user3.getNom());
    }
}
