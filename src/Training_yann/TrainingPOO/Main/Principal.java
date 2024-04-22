package Training_yann.TrainingPOO.Main;

import Training_yann.TrainingPOO.Fichier.GestionFichier;
import Training_yann.TrainingPOO.Poo.Student;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        /*
          Création, et écriture dans le fichier bdd.txt
         */

        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        Scanner scs = null;
        String[] tb=Student.ajoutStudent(sc);

        student.setNomStudent(tb[0]);
        student.setMatriculeStudent(tb[1]);
        student.setFiliereStudent(tb[2]);
        student.setNiveauStudent(Integer.parseInt(tb[3]));

        File newFile = new File("src/Training_yann/bdd/bdd.txt");
        try {
            GestionFichier.ecritureFichier(newFile,student,scs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
