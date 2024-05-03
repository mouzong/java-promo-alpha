package Training_yann.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utilisateur {
    private String nomUtilisateur;
    private String motDePasse;
    private Connection connexion;

    public Utilisateur(String nomUtilisateur, String motDePasse) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.connexion = connexion;
    }

    public Utilisateur() {
    }

    public void seConnecter(String url, String utilisateurBD, String motDePasseBD) throws SQLException {
        connexion = DriverManager.getConnection(url, utilisateurBD, motDePasseBD);
    }

    // Méthode pour vérifier si l'utilisateur existe dans la base de données
    public boolean verifierUtilisateur() throws SQLException {
        String query = "SELECT * FROM utilisateur WHERE login = ? AND mot_de_passe=?";;
        PreparedStatement statement = connexion.prepareStatement(query);
        statement.setString(1, nomUtilisateur);
        statement.setString(2, motDePasse);
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
    public void deconnecter() throws SQLException {
        if (connexion != null && !connexion.isClosed()) {
            connexion.close();
        }
    }

}
