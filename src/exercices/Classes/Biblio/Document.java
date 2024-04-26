package exercices.Classes.Biblio;

import java.util.Scanner;

public class Document {
    String titre;
    int numero;

    public Document(String titre, int numero) {
        this.titre = titre;
        this.numero = numero;
    }

    public void afficheDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\tSaisir le titre du document: ");
        titre=sc.nextLine();
        System.out.print("\tSaisir le numéro du document: ");
        try{
            numero=sc.nextInt();
        }catch(Exception e){
            e.getMessage();
        }

        System.out.println("\tLe numéro de série du document "+titre+" est "+numero);
    }

    public Document() {
    }
}
