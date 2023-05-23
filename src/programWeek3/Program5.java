
/** WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF
        Print in following format
        _______________________________
        | Salary Slip |
        |______________________________|
        | Employee Id : 2564 |
        | Employee Name : Jay |
        |______________________________|
        | Basic Salary : 25000.0 |
        | HRA 10% : 2500.0 |
        | TA 8% : 2250.0 |
        | DA 9% : 2000.0 |
        | PF - 20& : 5000.0 |
        |______________________________|
        | Gross Salary : 26750.0 |
        |===========================|*/
package programWeek3;

import java.util.Scanner;

public class Program5
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
grosssalary();

    }
    public static void grosssalary()
    {
        System.out.println("Please enter your name:");
        String name =sc.nextLine();
        System.out.println("Please enter your Id:");
        int  ID = sc.nextInt();
        System.out.println("Please enter your salary:");
        float salary =sc.nextFloat();
        float HRA =salary*10/100;
        float TA =salary*8/100;
        float DA = salary*9/100;
        float PF =salary*20/100;
        float gross = salary+HRA+TA+DA-PF;
        System.out.println("---------------------------------------------");
        System.out.println("|                salary slip                |");
        System.out.println("|   Employer Id"+ID +                   "|");
        System.out.println("Employee Name" +name+                    "|");
        System.out.println("|_________________________________________|");
        System.out.println("Basic salary :"+salary +                   "|");
        System.out.println("HRA 10% :" +HRA+                          "|");
        System.out.println("TA  :"+TA+                              "|");
        System.out.println("DA:"+DA+                               "|");
        System.out.println("PF"+PF+                                 "|");
        System.out.println("Gross salary :"+gross +                  "|");
        System.out.println("|=========================================|");

    }

}