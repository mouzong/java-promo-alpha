package recherches;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Date;
public class Test_palindrome  {
    public static final String ANSI_CYAN = "\u001B[36m";
     public static final String ANSI_RESET = "\u001B[0m";
   public static void main(String[] args) {

       Date date = new Date();
       System.out.println(ANSI_CYAN+date+ANSI_RESET);

       Scanner saisi = new Scanner(System.in);
        System.out.println("Bien vouloir entrer la valeur du mot à verifier: ");
        String motAtester = saisi.nextLine().toUpperCase();
        System.out.println("le mot entrée est: " + motAtester);

        String reversedText = new StringBuilder(motAtester).reverse().toString();

            if (motAtester.equals(reversedText)) {
                System.out.println("C'est un palindrome !");
            }
            else {
                System.out.println("Ce n'est pas un palindrome.");
            }
            saisi.close();
        }
    }

