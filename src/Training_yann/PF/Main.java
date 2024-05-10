package Training_yann.PF;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static Training_yann.PF.Utilisateur.ajout;

public class Main {

    public static void main(String[] args) throws IOException {
      int exit=0;
        Set<Utilisateur> listUser = new HashSet<>();
        Scanner sc=new Scanner(System.in);
        Utilisateur user = new Utilisateur();
        File file = new File("src/Training_yann/PF/src.txt");
        while(exit==0){
           MenuApp.menuPrincipal(sc);


          ajout.apply(user, listUser);
          System.out.println(listUser);




      }

    }


}
