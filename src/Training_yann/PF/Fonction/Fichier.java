package Training_yann.PF.Fonction;

import java.io.File;
import java.io.IOException;

public interface Fichier {

    public void creerFichier(File file) throws IOException;
    public void ecrireFichier(File file);
    public void lireFichier(File file);
    public void supprimerFichier(File file);
}
