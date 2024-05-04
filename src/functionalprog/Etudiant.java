package functionalprog;

public class Etudiant {
    private String nomComplet;
    private String filiere;
    private int niveau;
    private int age;
    private Genre genre;

    public Etudiant(String nomComplet, String filiere, int niveau, int age, Genre genre) {
        this.nomComplet = nomComplet;
        this.filiere = filiere;
        this.niveau = niveau;
        this.age = age;
        this.genre = genre;
    }

    public Etudiant() {
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nomComplet='" + nomComplet + '\'' +
                ", filiere='" + filiere + '\'' +
                ", niveau=" + niveau +
                ", age=" + age +
                ", genre=" + genre +
                '}';
    }
}
