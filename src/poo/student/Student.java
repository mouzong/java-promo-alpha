package poo.student;

import java.util.Objects;

public class Student {
    private String nomComplet;
    private String matricule;
    private String filiere;
    private String niveau;

    public Student() {
    }

    public Student(String nomComplet, String matricule, String filiere, String niveau) {
        this.nomComplet = nomComplet;
        this.matricule = matricule;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public String getNomComplet() {

        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nomComplet, student.nomComplet) && Objects.equals(matricule, student.matricule) && Objects.equals(filiere, student.filiere) && Objects.equals(niveau, student.niveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, matricule, filiere, niveau);
    }

    @Override
    public String toString() {
        return matricule + "{" +
                "nomComplet='" + nomComplet + '\'' +
                ", filiere='" + filiere + '\'' +
                ", niveau='" + niveau + '\'' +
                '}';
    }

    public String returnFormattedStudentData() {
        return matricule + " {" +
                "\n\t\tnomComplet : " + nomComplet +
                " \n\t\tfiliere     : " + filiere +
                " \n\t\tniveau     : " + niveau +
                "\n }";
    }
}
