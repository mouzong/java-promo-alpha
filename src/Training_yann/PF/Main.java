package Training_yann.PF;

import Training_yann.PF.Fonction.Client;
import Training_yann.PF.Menu.MenuApp;
import Training_yann.PF.Menu.MenuFacture;
import Training_yann.PF.User.Utilisateur;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;

import static Training_yann.PF.Menu.MenuApp.menuFacture;
import static Training_yann.PF.Menu.MenuApp.menuPrincipal;
import static Training_yann.PF.User.Utilisateur.ajout;

public class Main {

    public static void main(String[] args) throws IOException {
        int exit = 0;
        Set<Utilisateur> listUser = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        Utilisateur user = new Utilisateur();
        Client client1=new Client();
        File file = new File("src/Training_yann/PF/src.txt");
        String launchApp;
        while (exit == 0) {
            System.out.print("Saisir 'launch' pour lancer l'application ou 'exit' pour sortir: ");
            launchApp = sc.nextLine();
            while (!launchApp.equals("launch") && !launchApp.equals("exit")) {
                System.out.print("Saisir 'launch' pour lancer l'application ou 'exit' pour sortir");
                launchApp = sc.nextLine();
            }
            if (launchApp.equals("launch")) {

                System.out.println(menuFacture.apply(menuPrincipal(sc)));

if(menuFacture.apply(menuPrincipal(sc)).keySet().toString().contains("Client")){

    Client.ajout.apply(client1,sc);
}
            } else if (launchApp.equals("exit")) {
                exit = 1;
                System.out.println("\u001B[31mMerci d'avoir utilisé notre application, nous espérons " +
                        "vous revoir bientôt\u001B[00m");

            }


        }

    }


}
