package Training_yann.PF.Menu;

public enum Menu {
    Facturation("Facturation"),
    Gestion_du_stock("Gestion du stock"),
    Suivi_de_la_clientele("Suivi de la clientèle"),
    Gestion_des_utilisateurs("Gestion des utilisateurs"),
    Sortir("Sortir");

    private String displayName;

    Menu(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
