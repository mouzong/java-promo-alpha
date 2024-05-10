package Training_yann.PF;

public enum menu {
    Facturation("Facturation"),
    Gestion_du_stock("Gestion du stock"),
    Suivi_de_la_clientele("Suivi de la clientèle"),
    Gestion_des_utilisateurs("Gestion des utilisateurs");

    private String displayName;

    menu(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
