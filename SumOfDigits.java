
package sumofdigits;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number Between 0 and 1000: ");
        double number = input.nextDouble();
        
        int Digit1 = (int)number % 10;
        number = number / 10;
        
        int Digit2 = (int)number % 10;
        number = number / 10;
        
        int Digit3 = (int)number % 10;
        number = number / 10;
        
        System.out.println("The sum of the digits " + (Digit1 + Digit2 + Digit3));
        
    }
    
}
