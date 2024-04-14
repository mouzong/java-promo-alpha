package recherches;

public class Compte_Mots {

    public static void main(String[] args) {
        String texte = "Ceci est un exemple de chaîne de caractères.";
        String[] mots = texte.split(" "); // Divise la chaîne en mots

        int nombreDeMots = mots.length;
        System.out.println("Nombre de mots : " + nombreDeMots);
    }
}


