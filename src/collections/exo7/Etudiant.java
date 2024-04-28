package collections.exo7;

public class Etudiant {
    private String nomComplet;
    private String matricule;
    private String filiere;
    private int niveau;
    private BulletinDeNote bulletinDeNote;
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

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public BulletinDeNote getBulletinDeNote() {
        return bulletinDeNote;
    }

    public void setBulletinDeNote(BulletinDeNote bulletinDeNote) {
        this.bulletinDeNote = bulletinDeNote;
    }
}
