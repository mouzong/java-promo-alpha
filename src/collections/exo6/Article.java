package collections.exo6;

import java.util.Objects;
import java.util.UUID;

public class Article {
    private String idArticle;
    private String nomArticle;
    private double price;

    public Article() {
        String uuid = UUID.randomUUID().toString();
        this.idArticle = uuid.substring(uuid.length() - 16);
    }

    public Article(String nomArticle, double price) {
        String uuid = UUID.randomUUID().toString();
        this.idArticle = uuid.substring(uuid.length() - 16);
        this.nomArticle = nomArticle;
        this.price = price;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Double.compare(price, article.price) == 0 && Objects.equals(idArticle, article.idArticle) && Objects.equals(nomArticle, article.nomArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, nomArticle, price);
    }

    @Override
    public String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", nomArticle='" + nomArticle + '\'' +
                ", price=" + price +
                '}';
    }
}
