/*
 * 2.17 (Arithmetic, Smallest and Largest) Write an application 
 * that inputs three integers from the user and displays the sum, 
 * average, product, smallest and largest of the numbers. Use the 
 * techniques shown in Fig. 2.15. [Note: The calculation of the 
 */ 
import java.util.Scanner;

public class chap2_217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer");
        int num2 = input.nextInt();

        System.out.println("Enter the third integer");
        int num3 = input.nextInt();

        input.close();

        System.out.printf("Sum: %d\n", num1 + num2 + num3);
        System.out.printf("Average: %d\n", (num1 + num2 + num3) / 3);
        System.out.printf("Product: %d\n", num1 * num2 * num3);
        
        //Smallest Number
        if (num1 == num2 && num1 == num3) {
            System.out.printf("These numbers are equal \n", num1, num2, num3);
        }
        else if (num1 < num2 && num1 < num3) {
            System.out.printf("Smallest: %d\n", num1);
        }
        else if (num2 < num3) {
            System.out.printf("Smallest: %d\n", num2);
        }
        else {
            System.out.printf("Smallest: %d\n", num3);
        }

        //Largest Number
        if (num1 == num2 && num1 == num3) {
            System.out.println("These numbers are equal \n");
        }
        else if (num1 > num2 && num1 > num3) {
            System.out.printf("Largest: %d\n", num1);
        }
        else if (num2 > num3) {
            System.out.printf("Largest: %d\n", num2);
        }
        else {
            System.out.printf("Largest: %d\n", num3);
        }
    }
}