package Training_yann.Connexion;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur("yann", "06f926");

        try {
            // Connexion à la base de données
            utilisateur.seConnecter("jdbc:mysql://localhost:3306/foodly", "root", "06f926");

            // Vérification de l'utilisateur
            if (utilisateur.verifierUtilisateur()) {
                System.out.println("L'utilisateur est valide.");
            } else {
                System.out.println("L'utilisateur n'existe pas ou le mot de passe est incorrect.");
            }

            // Fermeture de la connexion
            utilisateur.deconnecter();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

