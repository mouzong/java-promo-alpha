package recherches;
import recherches.Essai;
public class Contole {
    public static void main(String[] args) {
Essai test = new Essai();
int resultat = test.addition(2, 7);
        System.out.println( resultat);
        System.out.println(test.addition(8,15));
        System.out.println(test.diviser(45,35));
        System.out.println(test.multiplier(25,47));
        System.out.println(test.soustraire(68,25));
    }
}
