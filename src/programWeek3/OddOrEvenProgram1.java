/**Write a java program that tells us that Input number is odd or even?
 *HINT: use ternary operator (? :
 */
package programWeek3;

import java.util.Scanner;

public class OddOrEvenProgram1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {//main method
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";

        System.out.println(num + " is " + result);

    }
}
