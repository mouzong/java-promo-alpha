package Training_yann.TrainingPOO.Poo;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    String nomStudent;
    String matriculeStudent;
    String filiereStudent;
    int niveauStudent;


    public Student(String nomStudent, String matriculeStudent, String filiereStudent, int niveauStudent) {
        this.nomStudent = nomStudent;
        this.matriculeStudent = matriculeStudent;
        this.filiereStudent = filiereStudent;
        this.niveauStudent = niveauStudent;


    }


    public Student() {
    }

    public String getNomStudent() {
        return nomStudent;
    }

    public void setNomStudent(String nomStudent) {
        this.nomStudent = nomStudent;
    }

    public String getMatriculeStudent() {
        return matriculeStudent;
    }

    public void setMatriculeStudent(String matriculeStudent) {
        this.matriculeStudent = matriculeStudent;
    }

    public String getFiliereStudent() {
        return filiereStudent;
    }

    public void setFiliereStudent(String filiereStudent) {
        this.filiereStudent = filiereStudent;
    }

    public int getNiveauStudent() {
        return niveauStudent;
    }

    public void setNiveauStudent(int niveauStudent) {
        this.niveauStudent = niveauStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(matriculeStudent, student.matriculeStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculeStudent);
    }


    @Override
    public String toString() {
        return "\t"+matriculeStudent + "{" + nomStudent+
                ","+filiereStudent +","+niveauStudent +'}'+"\n";
    }

    public static String[] ajoutStudent(Scanner sc) {
        String[] tbb = new String[4];
        System.out.print("\tSaisir le nom complet: ");
        tbb[0] = sc.nextLine();
        System.out.print("\tSaisir le matricule: ");
        tbb[1] = sc.nextLine();
        System.out.print("\tSaisir la filière: ");
        tbb[2] = sc.nextLine();
        System.out.print("\tSaisir le niveau: ");
        tbb[3] = sc.nextLine();
        System.out.println("\t-----------------------");
        return tbb;

    }
}
