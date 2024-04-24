package poo.biblio;

public class Document {
    private String titre;
    private String numero;

    public Document(String titre, String numero) {
        this.titre = titre;
        this.numero = numero;
    }

    public void afficherDetails(){
        System.out.println("\n\t Titre : "+titre);
        System.out.println("\t Numero : "+numero);
    }
}
