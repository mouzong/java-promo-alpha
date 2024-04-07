import org.jetbrains.annotations.NotNull;

import javax.swing.text.StringContent;

import java.util.Locale;

import static java.lang.System.out;

public class Yann {
    public static void main(String[] args) {
        out.println("Bonjour je me prénomme Yann, et je suis developpeur java junior");
        Test test_bonjour=new Test(" Bonjour");

      test_bonjour.afficheString();

    }

}

class Test{
    String eter;
    Test(@NotNull String eter){
        this.eter=eter;
    }
    void afficheString(){
        System.out.println(eter.substring(4,7)); //stxt en Excel, Milieu en windev, ....Selection d'une sous chaine de caractère
        out.println(eter.toUpperCase(Locale.ROOT)); //mettre en majuscule
        out.println(eter.charAt(4));   //selection d'un caractère
        out.println(eter.chars());   //?????
        out.println(eter.codePointAt(0)); //Renvoie le caractère ASCII
        out.println(eter.codePointBefore(2)); //Renvoie le caractère ASCII du caractère d'avant celle ci
        out.println(eter.codePointCount(0,3)); //compte le nombre de caractère ASCII
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
        int i=eter.indexOf("onjou");
        out.println(i);
        out.println(eter.lines());






    }


}
