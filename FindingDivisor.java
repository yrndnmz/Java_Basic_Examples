package findingdivisor;

import java.util.Scanner;

public class FindingDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + 1) % (j + 1) == 0 || (j + 1) % (i + 1) == 0) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.print(i + 1);
            System.out.println();
        }
    }
}
