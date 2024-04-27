package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Iterator iterator = stringSet.iterator();

        stringSet.add("Eric MBIDA");
        stringSet.add("Eric MBIDA");
        stringSet.add("Ali MOHAMAN");
        stringSet.add("Yannick KWADJIO");

//        for (int i = 0; i< stringSet.size();i++){
//            System.out.println(stringSet);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Entrez un entier : ");
        sc.nextInt();
        sc.nextLine();

        System.out.print("\n\t Entrez votre prenom : ");
        sc.nextLine();

        System.out.print("\n\t Entrez votre nom : ");
        sc.nextLine();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(stringSet);
    }
}
