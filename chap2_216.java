/*
2.16 (Comparing Integers) Write an application that asks the user 
to enter two integers, obtains them from the user and displays the 
larger number followed by the words "is larger". If the numbers are 
equal, print the message "These numbers are equal". Use the 
techniques shown in Fig. 2.15.
*/
import java.util.Scanner;

public class chap2_216 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        input.close();

        if (num1 == num2) {
            System.out.println("These numbers are equal \n");
        }

        if (num1 < num2) {
            System.out.printf("%d is larger \n", num2);
        }
        
        if (num1 > num2) {
            System.out.printf("%d is larger \n", num1);
        }
    }
}
