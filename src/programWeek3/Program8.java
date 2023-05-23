/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry
 */
package programWeek3;


import java.util.Scanner;

public class Program8{
    public static Scanner sc = new Scanner(System.in);
    public void alphabetFind()
{
    System.out.println("Enter city name");
    char ch = sc.next().charAt(0);
    if(ch =='a'||ch=='b'|| ch=='c' || ch=='d' || ch=='e' || ch=='f' ||ch =='A'||ch=='B'|| ch=='C' || ch=='D' || ch=='E' || ch=='F' ){
        System.out.println("This city name is valid.");
    } else{
        System.out.println("Invalid entry");
    }
}

    public static void main(String[] args) {
        Program8 pr = new Program8();
        pr.alphabetFind();
    }


}