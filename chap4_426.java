/*
4.25 What does this code print?
*/

public class chap4_426 {
     public static void main(String[] args) {
          int row = 10;
    
          while (row >= 1) {
               int column = 1;
    
               while (column <= 10) {
                    System.out.print(row % 2 == 1 ? "<" : ">");
                    ++column;
               }
   
              --row;
           System.out.println();
          }
     }
  }

   /*
     This code prints an alternating pattern of "<" and ">" repeatedly in each
     column based on the number specified in 'column'. In this case 10,
     so it will print 10 '<' and 10 '>'.
     It will alternate the rows of '<' and '>' by using 'row % 2' which is
     calculating the remainder when 'row' is divided by 2 creating even and odd
     rows.

     This is a while loop that counts down. In this case it starts at 10 and 
     and prints until it gets to 0. '--row' is decreasing each row by 1 until
     the loop gets to 1, as indicated by 'row >= 1'.
   */