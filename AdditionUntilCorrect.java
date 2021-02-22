package additionuntilcorrect;

import java.util.Scanner;

public class AdditionUntilCorrect {
    public static void main(String[] args) {
       
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
       while(answer != number1 + number2) {
           
           System.out.println("Your answer is wrong...");
           answer = input.nextInt();
        } 
       
            System.out.println("Your answer is correct...");
        }
        
    }
    

