package exercicesCours;

public class ExoString {
    public static void main(String[] args) {

        //String nom = new String("Hello word");
        String nom1 = args[0];
        String nom2 = args[1];

        System.out.println("\n\tmes chaines initiales en majuscule sont: \'"  +nom2.toUpperCase()+ "\' et \'" + nom1.toUpperCase()+"\'");
        System.out.println("\n\tmes chaines initiales en minuscule sont: \'" +nom2.toLowerCase()+ "\' et \'" + nom1.toLowerCase()+"\'");
        //System.out.println("\tExoString java ma chaine de caractere est: " + nom.toUpperCase());
        //System.out.println("\tExoString java ma chaine de caractere est: " + nom.toLowerCase());
        System.out.println("\tles tailles respectives des chaines sont: " + nom1.length()+ " et " +nom2.length());
        //if (nom1.equals(nom2)) {
        if (nom1.contains(nom2)) {
            System.out.println("\n\tLe chaine \'" +nom2+ "\' est contenue dans \'" +nom1+"\'");
        }
        else {
            System.out.println("\n\tLe chaine \'" +nom2+ "\' n'est pas contenue dans \'" +nom1+"\'");
        }

    }
}
