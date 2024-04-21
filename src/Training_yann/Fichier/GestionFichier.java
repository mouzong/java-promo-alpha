package Training_yann.Fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestionFichier {
    public static void ecritureFichier(File fichier1, Object ajout, Scanner scs) throws IOException {
        try {
            fichier1.createNewFile();
            FileWriter fWriter = new FileWriter(fichier1, true);
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.print(ajout);
            pWriter.flush();
            pWriter.close();
            scs = new Scanner(fichier1);
            while (scs.hasNext()) {
                System.out.println(scs.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}




