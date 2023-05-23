/**Write a java program to input any number and find out if it’s odd or even
 *
 */
package programWeek3;

import java.util.Scanner;

public class Program6
{public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     oddoreven();
    }
    public static void oddoreven() {
        System.out.println("Enter number");
        int num = sc.nextInt();
        if ((num%2) ==0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }
    }

}
