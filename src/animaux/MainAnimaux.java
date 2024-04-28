package animaux;

public class MainAnimaux {
    public static void main(String[] args) {
        Chat chat =new Chat();
        Chien chien = new Chien();
        Oiseau oiseau1 = new Oiseau();

        chat.cris();
        chien.cris();
        oiseau1.cris();
    }
}
