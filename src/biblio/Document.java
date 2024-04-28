package biblio;

import java.util.Objects;

public class Document {
    private String titre;
   private String numero;

    public Document(String titre, String numero) {

    }

    public void afficheDetail() {
        System.out.println(" =======Information détaillée sur le livre========");
        System.out.println("\t\t le titre est: " + titre);
        System.out.println("\t\t le numero est: " + numero);

    }


}
