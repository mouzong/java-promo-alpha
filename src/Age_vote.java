import java.util.Scanner;

public class Age_vote {
    public static void main(String[] args) {
        int age;
        final int age_vote = 18;
        Scanner console = new Scanner(System.in);
        System.out.println("Veuillez entrer votre age : ");

        age= console.nextInt();

        if (age< age_vote) System.out.println("Désolé, à "+ age + " ans, vous n'avez pas encore atteind l\'age de vote");
        else System.out.println("Vous avez atteind l\'age de vote");
    }
}
