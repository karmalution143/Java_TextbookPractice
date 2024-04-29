/*3.12 (Invoice Class) Create a class called Invoice 
that a hardware store might use to represent an invoice 
for an item sold at the store. An Invoice should include 
four pieces of information as instance variables—a part 
number (type String), a part description (type String), 
a quantity of the item being purchased (type int) and a 
price per item (double). Your class should have a 
constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable. 
In addition, provide a method named getInvoiceAmount that 
calculates the invoice amount (i.e., multiplies the quantity 
by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. If the 
price per item is not positive, it should be set to 0.0. 
Write a test app named InvoiceTest that demonstrates class 
Invoice’s capabilities.
*/

import java.util.Scanner;

class chap3_312_driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Part Number: ");
        String partNum = input.nextLine();

        System.out.println("Part Description: ");
        String partDesc = input.nextLine();

        System.out.println("Enter the Quantity: ");
        double qty = input.nextDouble();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        chap3_312 myInvoice = new chap3_312(partNum, partDesc, qty, price);

        System.out.printf("Part Number: %s\n", myInvoice.getPartNum());
        System.out.printf("Part Description, %s\n", myInvoice.getPartDesc());
        System.out.printf("Quantity: %.2f\n", myInvoice.getQTY());
        System.out.printf("Price: %.2f\n", myInvoice.getPrice());
        System.out.printf("Invoice Total: %.2f\n", myInvoice.calculateInvoiceAmmount());
    
        input.close();
    }

}