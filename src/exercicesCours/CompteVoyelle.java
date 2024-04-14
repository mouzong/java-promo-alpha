package exercicesCours;

public class CompteVoyelle {
    public static void main(String[] args) {
        String chaine = args[0].toLowerCase();
        int voyelles = 0;

        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                voyelles++;
            }
        }
        System.out.println("\til y'a " + voyelles + " voyelles dans la chaine");
    }
}



