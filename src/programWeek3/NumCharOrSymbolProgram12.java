
/**Write a program that tells us input value is number or an alphabet or symbol.
package programWeek3;
 */
import java.util.Scanner;
public class NumCharOrSymbolProgram12 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char ch;     //Declare a character
        System.out.println("Enter the character ");
        ch = sc.next().charAt(0);   //Initialize the character

        //check whether alphabet or not using if-else statement

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.print(ch + " is an Alphabet ");
        } else
        {
            System.out.print(ch + " is not an Alphabet ");

        }
    }
}


