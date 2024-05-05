package exercices.Recap;

import java.io.*;
import java.util.List;


public interface Fichier {
    /**
     * Création d'un fichier de stockage des données
     */
    public void ecrireFichier(FileWriter fileWriter, List<Inventaire> listArticle);

    public void lectureFichier(File file) throws FileNotFoundException;
    public void suppressionFichier(File file,String uuid) throws IOException;

}
