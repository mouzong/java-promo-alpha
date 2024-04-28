package poo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) throws RuntimeException, IOException {
        Scanner saisiClavier = new Scanner(System.in);
        File monbd = new File("src/poo/student.txt");
        try {
            monbd.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("\n\t Combien d'etudiants voulez-vous enregistrer? : ");
        int effectif = saisiClavier.nextInt();
        saisiClavier.nextLine();


        FileWriter monbdWriter = new FileWriter(monbd);
        PrintWriter monbdprintWriter = new PrintWriter(monbdWriter);

        Etudiant[] studentList = new Etudiant[4];

        for (int i = 1; i <= effectif; i++) {
            System.out.println("\n\t Entrez les information de l'etudiant numero : " + i);
            Etudiant student = new Etudiant();
            studentList[0] = student;

            System.out.print("\n\t Entrez le nom complet: ");
            studentList[0].setNomComplet(saisiClavier.nextLine());

            System.out.print("\n\t Entrez le matricule: ");
            studentList[0].setMatricule(saisiClavier.nextLine());

            System.out.print("\n\t Entrez la filière: ");
            studentList[0].setFiliere(saisiClavier.nextLine());

            System.out.print("\n\t Entrez le niveau: ");
            studentList[0].setNiveau(Integer.parseInt(saisiClavier.nextLine()));


            monbdprintWriter.println(studentList[0]);
        }
        monbdprintWriter.flush();
        monbdprintWriter.close();

        Scanner sc = new Scanner(monbd);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());

        }

    }

}
