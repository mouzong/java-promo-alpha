package exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciceOne {
    boolean yes = false;

    private void calculate(int number){

        System.out.println("============ Multiplication table of " + number + " =========");
        for (int i = 0; i <= 10; i++) {
            int result = number * i;
            System.out.println("                   "+number + " x" + " " + i + " = " + result);
        }
        System.out.println("\n");
    }

    public void run() {
        do{
            int number = 0;
            System.out.println("Enter a number to display its multiplication table...");
            Scanner reader = new Scanner(System.in);try {
            number = reader.nextInt();
            yes = true;
            }catch(InputMismatchException e){
                yes = false;
            }
            if(yes){
                calculate(number);
            }
        }
        while(yes);
        System.out.println("Thank you an good bye!");
    }
}
