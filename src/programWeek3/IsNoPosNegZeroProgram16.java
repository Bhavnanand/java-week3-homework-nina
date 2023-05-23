/**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”
 */
package programWeek3;

import java.util.Scanner;

public class IsNoPosNegZeroProgram16 {
    public static Scanner sc = new Scanner(System.in);
    static void checkNumber(int num){//static method with parameter
        //check if number is positive, negative or zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
    public static void main( String args[] ) {
        // create some number values
       // int no1 = 20;
       // int no2 = 0;
      //  int no3 = -100;
      //  int no4 = 4 * -1;
        System.out.println("Enter number you wish to check");
        int num = sc.nextInt();

        // invoke function
        checkNumber(num);
        //checkNumber(no2);
       // checkNumber(no3);
       // checkNumber(no4);
    }
}

