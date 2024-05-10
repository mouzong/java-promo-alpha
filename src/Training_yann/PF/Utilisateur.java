package Training_yann.PF;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.BiFunction;


public class Utilisateur implements Fichier {
    String nom;
    String prenom;
    String email;
    String user;
    String mdp;
    String profil;
    String statut;
    int telephone;
    int nbreConnexion;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email, String user, String mdp, String profil, String statut, int telephone, int nbreConnexion) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.user = user;
        this.mdp = mdp;
        this.profil = profil;
        this.statut = statut;
        this.telephone = telephone;
        this.nbreConnexion = nbreConnexion;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getNbreConnexion() {
        return nbreConnexion;
    }

    public void setNbreConnexion(int nbreConnexion) {
        this.nbreConnexion = nbreConnexion;
    }

    @Override
    public String toString() {
        return user+"{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", user='" + user + '\'' +
                ", mdp='" + mdp + '\'' +
                ", profil='" + profil + '\'' +
                ", statut='" + statut + '\'' +
                ", telephone=" + telephone +
                ", nbreConnexion=" + nbreConnexion +
                '}';
    }

    public static BiFunction<Utilisateur, Set<Utilisateur>, Set<Utilisateur>> ajout = (info, listUser) -> {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom de l'utilisateur: ");
        info.setNom(sc.nextLine());
        while (info.getNom().isEmpty()) {
            System.out.print("Entrez à nouveau le nom de l'utilisateur: ");
            info.setNom(sc.nextLine());
        }
        System.out.print("Entrez le prénom de l'utilisateur: ");
        info.setPrenom(sc.nextLine());
        while (info.getPrenom().isEmpty()) {
            System.out.print("Entrez à nouveau le prenom de l'utilisateur: ");
            info.setPrenom(sc.nextLine());
        }
        System.out.print("Entrez l'e-mail': ");
        info.setEmail(sc.nextLine());
        while (info.getEmail().isEmpty()) {
            System.out.print("Entrez à nouveau l'e-mail de l'utilisateur: ");
            info.setEmail(sc.nextLine());
        }
        System.out.print("Entrez le login de l'utilisateur: ");
        info.setUser(sc.nextLine());
        while (info.getUser().isEmpty()) {
            System.out.print("Entrez à nouveau le login de l'utilisateur: ");
            info.setUser(sc.nextLine());
        }
        System.out.print("Entrez le mot de passe: ");
        info.setMdp(sc.nextLine());
        System.out.print("Entrez le profil de l'utilisateur: ");
        info.setProfil(sc.nextLine());
        while (info.getProfil().isEmpty()) {
            System.out.print("Entrez à nouveau le profil de l'utilisateur: ");
            info.setProfil(sc.nextLine());
        }
        info.setStatut("Inactif");
        System.out.print("Entrez le téléphone de l'utilisateur: ");
        try {
            info.setTelephone(sc.nextInt());
            sc.nextLine();
            info.setNbreConnexion(0);
            listUser.add(info);

        } catch (Exception e) {
            System.out.println("Saisie incorrecte, erreur interne: " + e.getMessage());
        }
        return listUser;
    };

    @Override
    public void creerFichier(File file) throws IOException {
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void ecrireFichier(File file) {

    }

    @Override
    public void lireFichier(File file) {

    }

    @Override
    public void supprimerFichier(File file) {

    }
}



