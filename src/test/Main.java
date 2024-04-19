package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ajout_user user1=new Ajout_user();
      Scanner sc=new Scanner(System.in);
        String[] tab=user1.user(sc);
        System.out.println("\t"+tab[0]);
    }
}
