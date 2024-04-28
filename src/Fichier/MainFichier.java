package Fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFichier {
    public static void main(String[] args) throws IOException {
        File fichier = new File("src/Fichier/mon-fichier-test.txt");
        try {
            fichier.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileWriter fileWriter = new FileWriter(fichier);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(" Ajout d'une chaine de caractere dans le fichier");
        printWriter.println(" Ajout d'une autre chaine de caractere dans le fichier");
        printWriter.println(" Ajout d'une troisieme chaine de caractere dans le fichier");

        printWriter.flush();
        printWriter.close();

        Scanner sc = new Scanner(fichier);

        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
