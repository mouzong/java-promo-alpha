package Training_yann.PF.Menu;

public enum MenuArticle {

    Ajouter("Ajouter"),
    Consulter("Consulter");

    private String nameArticle;
    MenuArticle(String nameArticle){
        this.nameArticle=nameArticle;
    }
    public String getNameArticle(){
        return nameArticle;
    }
}
