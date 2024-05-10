package Training_yann.PF;

import java.util.Scanner;

public class MenuApp {
  public static void menuPrincipal(Scanner sc){

      System.out.println("---Bienvenu à mkEvents---\n------------------------\n" +
              "1. "+menu.Facturation.getDisplayName()+"\n" +
              "2. "+menu.Gestion_du_stock.getDisplayName()+"\n" +
              "3. "+menu.Suivi_de_la_clientele.getDisplayName()+"\n" +
              "4. "+menu.Gestion_des_utilisateurs.getDisplayName());
      System.out.println("------------------------");
      System.out.print("Sélectionnez un module: ");
      try{
          int menuChoisi=sc.nextInt();
          sc.nextLine();
          while(menuChoisi<1 || menuChoisi>4){
              System.out.print("Sélectionnez un module: ");
            menuChoisi=sc.nextInt();
              sc.nextLine();
          }
      }catch(Exception e){
          System.out.println("\u001B[31mSaisie incorrect, Erreur interne: "+e.getMessage()+"\u001B[00m");
      }

  }

}
