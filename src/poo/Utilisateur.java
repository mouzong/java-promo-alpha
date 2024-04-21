package poo;

import java.util.Objects;

public class Utilisateur {
    String nom;
    String prenom;
    String email;
    String phone;
    String password;
    String userCode;

    public Utilisateur(String nom, String prenom, String email, String phone, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Utilisateur() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(userCode, that.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, email, phone, userCode);
    }

    @Override
    public String toString() {
        return "\n\t " + userCode + " {" +
                "\n\t\tnom      :  " + nom +
                ", \n\t\tprenom   :  " + prenom +
                ", \n\t\temail    :  " + email +
                ", \n\t\tphone    :  " + phone +
                ", \n\t\tpassword :  " + password +
                "\n\t }";

    }
}
