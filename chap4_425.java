/*
 * 4.25 What does this code print?
 */

public class chap4_425 {
public static void main(String[] args) {
    int count = 1;
    
    while (count <= 10) {
        System.out.println(count % 2 == 1 ? "****" : "++++++++");
               ++count;
            } 
        } 
     }

     /*
       This code prints an alternating pattern of "****" and "++++++++" 
       to a maximum number of 'count'. 
       It uses an alternating pattern by using 'count % 2' and calculating the remainder 
       when 'count' is divided by 2. So 'count % 2' checks if 'count' is an 
       even or odd number. if the result is 0, it means 'count' is even,
       if the result is 1, it means 'count' is odd.
       This code counts up by increments of 1 starting at number 1 and goes until 10.
    */