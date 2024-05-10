package Training_yann.PF.Menu;

public enum MenuClient {

    Ajouter("Ajouter"),

    Modifier("Modifier"),

    Consulter("Consulter"),
    Supprimer("Supprimer");

    private String nameClient;

    MenuClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }
}
