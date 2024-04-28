package exercicesCours.gestionBoutique;

import java.util.Objects;
import java.util.UUID;

public class Article {
    private UUID idArticle;
    private String nomArtice;
    private int prixArticle;

    public Article() {
        this.idArticle = UUID.randomUUID();
        this.nomArtice = nomArtice;
        this.prixArticle = prixArticle;
    }

    public UUID getIdArticle() {

        return idArticle;
    }

    public void setIdArticle(UUID idArticle) {

        this.idArticle = idArticle;
    }

    public String getNomArtice() {

        return nomArtice;
    }

    public void setNomArtice(String nomArtice) {

        this.nomArtice = nomArtice;
    }

    public int getPrixArticle() {

        return prixArticle;
    }

    public void setPrixArticle(int prixArticle) {

        this.prixArticle = prixArticle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return prixArticle == article.prixArticle && Objects.equals(idArticle, article.idArticle) && Objects.equals(nomArtice, article.nomArtice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, nomArtice, prixArticle);
    }

    @Override
    public String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", nomArtice='" + nomArtice + '\'' +
                ", prixArticle=" + prixArticle +
                '}';
    }
}
