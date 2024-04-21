package poo_Etudiant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        Etudiant etudiant1 = new Etudiant();
        String[] tb_recep = etudiant1.ajouterEtudiant();
                etudiant1.setNomComplet(tb_recep[0]);
                etudiant1.setMatricule(tb_recep[1]);
                etudiant1.setFiliere(tb_recep[2]);
                etudiant1.setNiveau(Integer.parseInt(tb_recep[3]));

        File fichierUtilisateur = new File("src/poo_Etudiant/Student.txt");


        try {
            fichierUtilisateur.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter fichierWriter = new FileWriter(fichierUtilisateur, true);
            PrintWriter printFichierUtilisateur = new PrintWriter(fichierWriter);
            printFichierUtilisateur.print(etudiant1);
            printFichierUtilisateur.flush();
            printFichierUtilisateur.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
