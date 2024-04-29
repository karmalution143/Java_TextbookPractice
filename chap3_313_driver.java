/* 3.13 (Employee Class) Create a class called Employee that includes 
three instance variables—a first name (type String), a last name 
(type String) and a monthly salary (double). Provide a constructor 
that initializes the three instance variables. Provide a set and a 
get method for each instance variable. If the monthly salary is not 
positive, do not set its value. Write a test app named EmployeeTest 
that demonstrates class Employee’s capabilities. Create two Employee 
objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again.
*/

import java.util.Scanner;

class chap3_313_driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        chap3_313 employee1 = new chap3_313("Karma", "Locicero", 15000);
        chap3_313 employee2 = new chap3_313("Sky", "Locicero", 18000);

        System.out.printf("Yearly Salary: %.2f\n", employee1.yearlySalary());
        System.out.printf("Yearly Salary: %.2f\n", employee2.yearlySalary());

        // give each employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        // display yearly salary after the raise
        System.out.println("Yearly salary of employee1 after 10% raise: " + employee1.yearlySalary());
        System.out.println("Yearly salary of employee2 after 10% raise: " + employee2.yearlySalary());
    
        input.close();
    }
}