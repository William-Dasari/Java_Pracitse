//program to calculate grade according to percentage

import java.util.Scanner;
public class New1
{

    public static void main(String[] args)
    {
        // Receiving dynamic values using scanner values

        int html,css,javascript,java,nodejs;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Student marks sheet \n Enter marks for the specified subjects");
        System.out.print("Html :       ");
        html=scanner.nextInt();
        System.out.print("CSS :        ");
        css=scanner.nextInt();
        System.out.print("javaScript : ");
        javascript=scanner.nextInt();
        System.out.print("Java :       ");
        java=scanner.nextInt();
        System.out.print("nodeJS :     ");
        nodejs=scanner.nextInt();

        //calculation of percentage

       int addition=html+css+javascript+java+nodejs;
       int percentage=addition*100;
       int value=percentage/500;
       System.out.print("Hi your overall Percentage is : "+value+"%\n");

       // deciding the grade

       if (html>=35 && css>=35 && javascript>=35 && java>=35 && nodejs>=35)
       {
            if (value >= 85 && value <= 100)

                System.out.println("Grade A");

            else if (value >=70 && value <= 84)

                System.out.println("Grade B");

            else if (value >=50 && value <=69)

                System.out.println("Grade C");

            else

                System.out.println("Grade D");

       }
       else
       {
           System.out.println("FAIL");
       }

    }
}
