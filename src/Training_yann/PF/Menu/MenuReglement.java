package Training_yann.PF.Menu;

public enum MenuReglement {
    Consulter("Consulter");
    String nameReglement;

    MenuReglement(String nameReglement) {
        this.nameReglement = nameReglement;
    }

    public String getNameReglement() {
        return nameReglement;
    }
}
