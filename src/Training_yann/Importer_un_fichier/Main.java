package Training_yann.Importer_un_fichier;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            // Création d'un objet JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // Optionnel : spécifier les types de fichiers autorisés à sélectionner
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Tous les fichiers", "txt");
            fileChooser.setFileFilter(filter);

            // Afficher la boîte de dialogue de sélection de fichier
            int returnValue = fileChooser.showOpenDialog(null);

            // Vérifier si l'utilisateur a sélectionné un fichier
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                // Récupérer le fichier sélectionné
                java.io.File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Fichier sélectionné : " + selectedFile.getAbsolutePath());
            } else {
                System.out.println("Aucun fichier sélectionné.");
            }
        }
    }
