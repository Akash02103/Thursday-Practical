import java.util.Scanner;
class Evenodd
{
    public static void main(String args[])
    {
        int num;
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        num=a.nextInt();
        if(num%2==0)
        {
            System.out.println("the no is even");
        }
        else
        {
            System.out.println("the number is odd");
        }
    }
}
