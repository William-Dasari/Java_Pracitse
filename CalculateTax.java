// program calculating the annual tax of an Employee
import java.util.Scanner;
public class CalculateTax
{
    public static void main(String[] args)
    {
        //code for initializing and taking the values from the end user
        int birthdate,birthmonth,birthyear,salary;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter below details to calculate the Tax : \n");
        System.out.print("Enter your Name :");
        String name=scanner.next();
        System.out.print("Enter your Birth Date(only date i.e 1-31) : ");
        birthdate=scanner.nextInt();
        System.out.print("Enter your Birth month(only month i.e 1-12) : ");
        birthmonth=scanner.nextInt();
        System.out.print("Enter your Birth year(only year i.e YYYY) : ");
        birthyear=scanner.nextInt();
        System.out.print("Enter your monthly salary : ");
        salary=scanner.nextInt();

        System.out.println("Employee details and Tax amount to pay");
        System.out.println("Name : "+name);
        System.out.println("DOB : "+birthdate+"/"+birthmonth+"/"+birthyear);
        System.out.println("your age : "+(2020-birthyear));

        //calculations

        int annual=salary*12;

        if (annual>=500000)
        {
            int tax = annual/100;
            int tax2=tax*20;
            int netIncome=annual-tax2;
            System.out.println("Hi "+name+" yours annual income is "+annual);
            System.out.println("As your annual income is above 5 lakhs \ni.e you have to pay 20% interest ");
            System.out.println("The tax should have to pay by you is "+tax2);
            System.out.println("Your NetIncome will be "+netIncome);
        }
        else if (annual>=400000 && annual<500000)
        {
            int tax = annual/100;
            int tax2=tax*15;
            int netIncome=annual-tax2;
            System.out.println("Hi "+name+" yours annual income is "+annual);
            System.out.println("As your annual income is in between 4 to 5 lakhs \ni.e you have to pay 15% interest ");
            System.out.println("The tax should have to pay by you is "+tax2);
            System.out.println("Your NetIncome will be "+netIncome);
        }
        else if (annual>=300000 && annual<400000)
        {
            int tax = annual/100;
            int tax2=tax*10;
            int netIncome=annual-tax2;
            System.out.println("Hi "+name+" yours annual income is "+annual);
            System.out.println("As your annual income is in between 3 to 4 lakhs \ni.e you have to pay 10% interest ");
            System.out.println("The tax should have to pay by you is "+tax2);
            System.out.println("Your NetIncome will be "+netIncome);
        }
        else if (annual>=200000 && annual<300000)
        {
            int tax = annual/100;
            int tax2=tax*5;
            int netIncome=annual-tax2;
            System.out.println("Hi "+name+" yours annual income is "+annual);
            System.out.println("As your annual income is in between 2 to 3 lakhs \ni.e you have to pay 5% interest ");
            System.out.println("The tax should have to pay by you is "+tax2);
            System.out.println("Your NetIncome will be "+netIncome);
        }
        else
            {
                System.out.println("your netIncome is "+annual);
                System.out.println("You are free from tax");
        }
    }
}
