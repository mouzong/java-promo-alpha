package exercices.notionClasse;

public class Document {
    String titre;
    int numero;

    public Document(String titre, int numero) {
        this.titre = titre;
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Document{" +
                "titre='" + titre + '\'' +
                ", numero=" + numero +
                '}';
    }
    public String afficheDetail(String args1,String args2,String args3,String args4){
        String afiche=args1+","+args2+","+args3+","+args4;
        return afiche;
    }

    public Document() {
    }
}
