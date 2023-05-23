/**Write a java program to input any two number and ask user to enter their symbol (+, -,
 /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)
 */
 package programWeek3;

import java.util.Scanner;

public class Operator_Program10
{  public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // taking input from the user using the Scanner
        System.out.println("Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // selecting the operand for the calculations
        System.out.println(
        "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        solve(a, b, op);

        }
public static void solve(int a, int b, char op)
{
    double ans = 0;

    if (op == '+') {
        ans = a + b;
        System.out.println("Addition of two numbers :" +ans);}
     else if (op == '-') {
        ans = a - b;
        System.out.println("subtraction of two numbers :"+ans);

    } else if (op == '*') {
        ans = a * b;
        System.out.println("multiplication of two numbers :"+ans);
    }

        else if ( op=='/')
        {
            ans = a/b;
            System.out.println("division of two numbers :"+ans);
        }
    }
}
