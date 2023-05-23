/**Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        _______________________________
        | |
        | Mark Sheet |
        |_______________________________|
        | Name : Jay |
        | Roll No: 08 |
        |_______________________________|
        | Subjects : Marks |
        |_______________________________|
        | Math : 98 |
        | Science : 90 |
        | English : 85 |
        |_______________________________|
        | Total : 273 |
        |_______________________________|
        | Percentage : 91.0 |
        | Result : Pass |
        | Grade : A+ |
        |_______________________________|
 */
package programWeek3;

import java.util.Scanner;

public class Program3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        marksheet();
    }

    public static void marksheet() {
        System.out.println("Student name");
        String name = sc.nextLine();
        System.out.println("Roll No.");
        int a = sc.nextInt();
        System.out.println("Maths marks");
        int maths = sc.nextInt();
        if (maths>=100 && maths>=0){
            System.out.println("Invalid Input.Marks should be between 0 and 100 ");
        }
        System.out.println("English marks");
        int eng = sc.nextInt();
        if (eng>=100 && eng>=0){
            System.out.println("Invalid Input.Marks should be between 0 and 100 ");
        System.out.println("science marks");
        int sci= sc.nextInt();
            if (sci>=100 && sci>=0){
                System.out.println("Invalid Input.Marks should be between 0 and 100 ");
         int sum =maths+sci+eng;
         float per =(sum*100)/300;
         int average =(sum*100)/300;
         String grade;
         String result;
         if (maths>= 35 && sci>= 35 && eng>= 35 ){
             result ="Pass";}
         else result ="Fail";
         if(average>= 80&& result=="Pass"){
             grade = "A";
         }else if(average>= 60 && result =="Pass"){
             grade ="B";
         }if (average>=35 && result == "Pass"){
             grade ="C";
                }else{
             grade= "";
                }
                System.out.println(" _______________________________");
                System.out.println("||");
                System.out.println("| Mark Sheet |");
                System.out.println("|_______________________________|");
                System.out.println("| Name :  |"+name);
                System.out.println("| Roll No: "+a+ "|");
                System.out.println("|_______________________________|");
                System.out.println("| Subjects : Marks |");
                System.out.println("|_______________________________|");
                System.out.println("| Maths : "+ maths+"|");
                System.out.println("| Science : "+sci+" |");
                System.out.println("| English : "+eng+" |");
                System.out.println("|_______________________________|");
                System.out.println("| Total : "+sum+"|");
                System.out.println("|_______________________________|");
                System.out.println("| Percentage : "+per+" |");
                System.out.println("| Result : "+result +"|");
                System.out.println("| Grade : "+grade +"|");
                System.out.println("|_______________________________|");
            }
         }

    }
}