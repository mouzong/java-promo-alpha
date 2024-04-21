package poo.student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) throws IOException {

        // Creation de mes scanner
        Scanner scannerConsole = new Scanner(System.in);

        // Creation/Ouverture de ma base de donnees
        File bd = new File("src/poo/student/student.txt");
        try {
            bd.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.print("\n\t Combien d'etudiants voulez-vous enregistrer? : ");
        int effectif = scannerConsole.nextInt();
        scannerConsole.nextLine();

        addStudents(effectif, bd, true, scannerConsole);

    }

    public static void addStudents(int nombreDetudiantsAAjouter, File bdEtudiant, boolean ajouterALaSuite, Scanner sc) throws IOException {

        FileWriter bdWriter = null;
        try {
            bdWriter = new FileWriter(bdEtudiant, ajouterALaSuite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PrintWriter bdPrinter = new PrintWriter(bdWriter);

        Student[] studentList = new Student[10];

        for (int i = 1; i <= nombreDetudiantsAAjouter; i++) {
            System.out.println("\n\t Entrez les information de l'etudiant numero : " + i);
            Student student = new Student();
            studentList[0] = student;

            System.out.print("\n\t Entrez le nom complet: ");
            studentList[0].setNomComplet(sc.nextLine());

            System.out.print("\n\t Entrez le matricule: ");
            studentList[0].setMatricule(sc.nextLine());

            System.out.print("\n\t Entrez la filière: ");
            studentList[0].setFiliere(sc.nextLine());

            System.out.print("\n\t Entrez le niveau: ");
            studentList[0].setNiveau(sc.nextLine());


            bdPrinter.println(studentList[0]);
//            bdPrinter.println("\n");
        }

        bdPrinter.flush();
        bdPrinter.close();

        Scanner scFichier = new Scanner(bdEtudiant);
        scFichier.

        System.out.println("\n\t " + studentList[0].returnFormattedStudentData());

    }
}
