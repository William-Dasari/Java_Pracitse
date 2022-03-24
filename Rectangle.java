/*package: is simple a folder or group which consists of similar type of classes packages and subpackages
they two types user defined and built in packages
 */
//Here practise is a user defined package name
package practise;
//public key word is a modifier the data which is defined using public keyword can accessible inside a package if a
//class is defined using public then the file name and the name of the class must be same
//Here Rectangle is the class name
public class Rectangle
{
    //length and bredth are instance variables
    int length,bredth;
    static int num;
    //getdata is function which dosent return any value
    //int x and y are local variables
    void getData(int x,int y)
    {
        length=x;
        bredth=y;
    }
    int calculateArea()
    {
     int area = length*bredth;
     return area;
    }
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.num=20;
        r.getData(10,20);
        Rectangle r1=new Rectangle();
        r1.num=2034;

        r1.getData(20,30);
        System.out.println(r.calculateArea());
        System.out.println(r1.calculateArea());
        System.out.println (r.num);
        System.out.println(r1.num);

    }

}
