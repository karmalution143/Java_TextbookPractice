/*
2.24 (Largest and Smallest Integers) Write an application that 
reads five integers and determines and prints the largest and 
smallest integers in the group. Use only the programming 
techniques you learned in this chapter.
*/
import java.util.Scanner;

public class chap2_224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer");
        int num2 = input.nextInt();

        System.out.println("Enter the third integer");
        int num3 = input.nextInt();

        System.out.println("Enter the forth integer");
        int num4 = input.nextInt();

        System.out.println("Enter the fifth integer");
        int num5 = input.nextInt();

        input.close();

        //Largest Number
        if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
            System.out.println("These numbers are equal \n");
        }
        else if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.printf("Largest: %d\n", num1);
        }
        else if (num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.printf("Largest: %d\n", num2);
        }
        else if (num3 > num4 && num3 > num5) {
            System.out.printf("Largest: %d\n", num3);
        }
        else if (num4 > num5) {
            System.out.printf("Largest: %d\n", num4);
        }
        else {
            System.out.printf("Largest: %d\n", num5);
        }

        //Smallest Number
        
        if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
            System.out.println("These numbers are equal \n");
        }
        else if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.printf("Smallest: %d\n", num1);
        }
        else if (num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.printf("Smallest: %d\n", num2);
        }
        else if (num3 < num4 && num3 < num5) {
            System.out.printf("Smallest: %d\n", num3);
        }
        else if (num4 < num5) {
            System.out.printf("Smallest: %d\n", num4);
        }
        else {
            System.out.printf("Smallest: %d\n", num5);
        }
    }   
}     