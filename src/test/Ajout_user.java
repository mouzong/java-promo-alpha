package test;
import java.util.*;
public class Ajout_user {
    public String[] user(Scanner sc){
        String[] user_temp=new String[7];
        System.out.println("\t=====Création d'un utilisateur=====");
        System.out.print("\tNom: ");
        user_temp[0]=sc.nextLine();
        System.out.print("\tPrénom: ");
        user_temp[1]=sc.nextLine();
        System.out.print("\tEmail: ");
        user_temp[2]=sc.nextLine();
        System.out.print("\tDate de naissance (JJ/MM/AAA): ");
        user_temp[3]=sc.nextLine();
        System.out.print("\tProfil: ");
        user_temp[4]=sc.nextLine();
        System.out.print("\tMot de passe: ");
        user_temp[5]=sc.nextLine();
        System.out.print("\tConfirmer mot de passe: ");
        user_temp[6]=sc.nextLine();

        return user_temp;
    }


}
