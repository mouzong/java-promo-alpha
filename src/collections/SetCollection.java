package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Eric MBIDA");
        stringSet.add("Eric MBIDA");
        stringSet.add("Ali MOHAMAN");
        stringSet.add("Yannick KWADJIO");
        stringSet.add("Steve ONDOUA");

        Iterator<String> iterator = stringSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //System.out.println(stringSet);
    }
}
