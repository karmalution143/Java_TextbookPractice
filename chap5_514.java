/*
 * 5.14 (Modified Compound-Interest Program) 
 * Modify the compound-interest application of 
 * Fig. 5.6 to repeat its steps for interest rates 
 * of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop 
 * to vary the interest rate.
 */

   public class chap5_514 { 
      public static void main(String[] args) { 
         double principal = 100000.0; // initial amount before interest


        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      for (double rate = .05; rate <= .10; rate += 0.01) {

         System.out.printf("Interest Rate: %.2f%%\n", rate * 100);

         // calculate amount on deposit for each of ten years
         for (int year = 1; year <= 10; ++year) {

         // calculate new amount on deposit for specified year
         double amount = principal * Math.pow(1.0 + rate, year);

         // display the year and the amount

         System.out.printf("%4d%,20.2f%n", year, amount);
         }

         // separate output for each interest rate
         System.out.println();
      }
   }
   }