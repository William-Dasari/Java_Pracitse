package practise;

public class EvenOdd
{
    void evennumber(int a)
    {
        if (a%2==0)
            System.out.println(a+" is even number");
        else
            System.out.println(a+" is odd number");
    }
    public static void main(String args[]){
        EvenOdd E=new EvenOdd();
        E.evennumber(6);
        E.evennumber(35);
        E.evennumber(22);
        E.evennumber(45946484);
        E.evennumber(65);


    }

}
