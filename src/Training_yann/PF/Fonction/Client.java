package Training_yann.PF.Fonction;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Client {
    UUID idClient= UUID.randomUUID();
    String nom;
    String prenom;
    LocalDate dteEnregistrement=LocalDate.now();
    int telephone;
    String email;
    String adresse;
    long debit = 0;
    long credit = 0;
    long soldeFinal = credit - debit;

    public Client(String nom, String prenom, int telephone, String email, String adresse, long debit, long credit, long soldeFinal) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
        this.debit = debit;
        this.credit = credit;
        this.soldeFinal = soldeFinal;
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

    public LocalDate getDteEnregistrement() {
        return dteEnregistrement;
    }

    public void setDteEnregistrement(LocalDate dteEnregistrement) {
        this.dteEnregistrement = dteEnregistrement;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getDebit() {
        return debit;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public long getSoldeFinal() {
        return soldeFinal;
    }

    public void setSoldeFinal(long soldeFinal) {
        this.soldeFinal = soldeFinal;
    }

    public UUID getIdClient() {
        return idClient;
    }

    public void setIdClient(UUID idClient) {
        this.idClient = idClient;
    }

    public Client() {
    }


    @Override
    public String toString() {
        return idClient+"{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dteEnregistrement=" + dteEnregistrement +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", soldeFinal=" + soldeFinal +
                '}';
    }

    public static BiFunction<Client, Scanner, String> ajout = (client, sc) -> {
        System.out.println("---------Informations du client---------");
        System.out.print("Nom: ");
        client.setNom(sc.nextLine());
        while(client.getNom().isEmpty()){
            System.out.print("Nom: ");
            client.setNom(sc.nextLine());
        }
        System.out.print("Prénom : ");
        client.setPrenom(sc.nextLine());
        while(client.getPrenom().isEmpty()){
            System.out.print("Prénom: ");
            client.setPrenom(sc.nextLine());
        }
        client.setDteEnregistrement(LocalDate.now());
        client.setIdClient(UUID.randomUUID());
        System.out.print("E-mail: ");
        client.setEmail(sc.nextLine());
        String motif = ".*@.*";
        Pattern pattern = Pattern.compile(motif);
        Matcher matcher = pattern.matcher(client.getEmail());
        while(!matcher.find()){
            System.out.print("E-mail: ");
            client.setEmail(sc.nextLine());
        }
        System.out.print("Adresse: ");
        client.setAdresse(sc.nextLine());
        while(client.getAdresse().isEmpty()){
            System.out.print("Adresse: ");
            client.setAdresse(sc.nextLine());
        }
        System.out.print("Nº Téléphone: ");
        try {
            client.setTelephone(sc.nextInt());
        } catch (Exception e) {
            System.out.println("\u001B[31mSaisie incorrecte, Erreur interne: " + e.getMessage() + "\u001B[00m");
        }


        return client.toString();
    };

}
