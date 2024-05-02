package exercices.Recap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public interface Fichier {
    /**
     * Création d'un fichier de stockage des données
     */
    public void lectureFichier(File file) throws FileNotFoundException;
    public void suppressionFichier(File file);
}
