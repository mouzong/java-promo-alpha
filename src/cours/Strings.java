package cours;

public class Strings {
    public static void main(String[] args) {
        String machaine0 = "Chaine de caractères numéro 1";
        String machaine1 = "Chaine de caractères numéro 1";
        String machaine2 = new String("Chaine de caractères numéro 1");

        System.out.println(machaine1.equals(machaine2));
//        System.out.println(machaine2);
        System.out.println(machaine1 == machaine2);
        System.out.println(machaine1 == machaine0);
    }
}
