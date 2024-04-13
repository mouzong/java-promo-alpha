import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class Yann {
    public static void main(String[] args) {
        out.println("Bonjour je me prénomme Yann, et je suis developpeur java junior");
        testStringOk test_bonjour = new testStringOk();

        test_bonjour.testString();

    }

}

class testString {
    String eter;

    testString(@NotNull String eter) {
        this.eter = eter;
    }

    void afficheString() {
        out.println(eter.substring(4, 7)); //stxt en Excel, Milieu en windev, ....Selection d'une sous chaine de caractère
        out.println(eter.toUpperCase(Locale.ROOT)); //mettre en majuscule
        out.println(eter.charAt(4));   //selection d'un caractère
        out.println(eter.chars());   //?????
        out.println(eter.codePointAt(0)); //Renvoie le caractère ASCII
        out.println(eter.codePointBefore(2)); //Renvoie le caractère ASCII du caractère d'avant celle ci
        out.println(eter.codePointCount(0, 3)); //compte le nombre de caractère ASCII
        out.println(eter.codePoints()); //?????
        out.println(eter.compareTo("Bonjo"));  //compare 2 chaines de caractère, si le resultat est <0 alors la première chaine vient avant la deuxième, si les 2 chaines sont égales alors les chaines sont identiques,...
        out.println(eter.compareToIgnoreCase(" bonjour")); //compare 2 chaines en ignorant la casse.
        out.println(eter.contains("jour")); //renvoie un booléen, équivalent à la méthode contient de windev
        out.println(eter.concat(" Monsieur Kwadjio")); //concatenation de 2 chaines de caractères
        out.println(eter.contentEquals(" bonjour")); //compare le charsequence de 2 objets de chaines
        out.println(eter.describeConstable()); //????
        out.println(eter.endsWith("r")); // renvoie un booléen si la chaine de caractère finit par la sous chaine saisit
        out.println(eter.equals(" Bonjour")); //compare l'égalité de 2 chaînes de caractères
        out.println("Salutation:%s".formatted(eter)); //reformatage du texte un peu comme une concatenation
        out.println(eter.hashCode());
        out.println(eter.indent(10)); //permet de tabuler une chaine de caractère
        int i = eter.indexOf("onjou");
        out.println(i);
        out.println(eter.lines());
        out.println(eter.isEmpty());
        out.println(eter.isBlank());


    }


}


class testStringOk {

    void testString() {

        Scanner sc = new Scanner(System.in);
        int exit = 1;
        while (exit != 0) {
            out.print("Entrez le jour de la semaine: ");
            String jourSemaine = sc.nextLine();
            int nbreJournee = switch (jourSemaine) {
                case "lundi", "mardi", "jeudi" -> 5;
                case "mercredi", "vendredi", "dimanche" -> 8;
                case "samedi" -> 6;
                default -> 0;

            };
            out.println(jourSemaine + "=>" + nbreJournee + " lettres");
            out.print("Souhaitez-vous relancer le programme y/n: ");
            sc.useDelimiter("(?<=\\G.{" + 1 + "})");   //limite le nombre de caractère.
            String reponse=sc.nextLine();
            if(reponse.equals("n")){
                exit=0;
                System.out.println("\u001B[31m\u001B[3mMerci de m'avoir utilisé\u001B[0m");
            }
        }
        sc.close();
    }

}
