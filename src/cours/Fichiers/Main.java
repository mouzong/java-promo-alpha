package cours.Fichiers;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Création fichier
        File fichier1 = new File("src/cours.Fichiers/mon-fichier-Training_yann.test.txt");
        try {
            fichier1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileWriter fileWriter = new FileWriter(fichier1);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("\n\tHello World!");
        printWriter.println("\n\tSalut le monde!");
        printWriter.println("\n\tComment va le monde?");
        printWriter.flush();
        printWriter.close();


        //lecture

        Scanner sc = new Scanner(fichier1);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

    }
}
