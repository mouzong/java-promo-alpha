package exercices.Recap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;


public interface Fichier {
    /**
     * Création d'un fichier de stockage des données
     */
    public void ecrireFichier(FileWriter fileWriter, List<String> listArticle);

    public void lectureFichier(File file) throws FileNotFoundException;
    public void suppressionFichier(File file);

}
