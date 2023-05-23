/**Same as above program-8 using switch statement.

 */
package programWeek3;

import java.util.Scanner;

public class Program9
{
    public static Scanner sc = new Scanner(System.in);
    public void cityName(String alphabet) {
        switch (alphabet) {
            case "A":
                System.out.println("City name is Amsterdam");
                break;
            case "B":
                System.out.println(" City name is : Bristol");
                break;
            case "C":
                System.out.println("City name is : Chicago");
                break;
            case "D":
                System.out.println("City name is : Diu");
                break;
            case "E":
                System.out.println(" City name is : Edinburgh");
                break;
            case "F":
                System.out.println(" City name is : Florida");
                break;
            default:
                System.out.println("Invalid data");

        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter any one alphabet from A to F");
        String name = sc.nextLine();
        Program9 obj = new Program9();
        obj.cityName(name);
    }
}
