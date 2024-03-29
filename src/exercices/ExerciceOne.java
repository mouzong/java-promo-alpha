package exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciceOne {
    boolean yes = false;

    private void printMultiplicationTableOf(int number){
        for (int i = 0; i <= 10; i++) {
            int result = number * i;
            System.out.println("                   "+number + " x" + " " + i + " = " + result);
        }
    }

    public void run() {
        do{
            int number = 0;
            System.out.println("\n"+"Enter a number to display its multiplication table, or any character to exit.");
            Scanner reader = new Scanner(System.in);
            try {
                number = Integer.parseInt(reader.next());
                if(number >= 0) {
                    yes = true;
                }
            }catch(InputMismatchException | NumberFormatException e){
                yes = false;
            }
            if(yes){
                System.out.println("============ Multiplication table of " + number + " =========");
                printMultiplicationTableOf(number);
                System.out.println("\n");
            }else{
                System.out.println("You did not enter a number! The program will exit. Thank you and good bye!");
            }
        }
        while(yes);
    }
}
