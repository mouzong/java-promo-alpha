package Training_yann.PF.Menu;

public enum MenuFacture {
    Ajouter("Ajouter"),
    Regler("Régler"),
    Consulter("Consulter");
    private String nameFacture;
    MenuFacture(String nameFacture){
        this.nameFacture=nameFacture;
    };
    public String getNameFacture(){
        return nameFacture;
    }
}
