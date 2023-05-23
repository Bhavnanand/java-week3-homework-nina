/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
 */
 package programWeek3;

import java.util.Scanner;

public class Program2
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
       leapYearOrNot();
    }
    public static void leapYearOrNot()
{
    System.out.println("Enter a year to check if it is a leap year\n");
    int  year= sc.nextInt();
    if (( year%4 == 0 ) && ((year % 100 != 0) ||(year % 400 == 0)))
    {
        System.out.println(year +" is a leap year.");  }

    else{
        System.out.println(year +" is not a leap year."
        ); }

  //  else{ if ( year%4 == 0 )
   // println("%d is a leap year.\n", year);}

 //   else
  //  println("%d is not a leap year.\n", year);

  //  return 0;
}
}
