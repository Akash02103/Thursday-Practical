class Cal
{
    void addition()
    {
        int a=10,b=20;
        int add=a+b;
        System.out.println("addtion is :" +add);
        
    }     
    void substraction()
    {
        int a=30,b=10;
        int sub=a-b;
        System.out.println("substriction is :" +sub);   
    }
    void mul()
    {
        int a=10,b=20;
        int m=a*b;
        System.out.println("multiplication is :" +m);
    }
    void div()
    {
        int a=10,b=20;
        int d=b/a;
        System.out.println("division is:"+d);
    }
    
}
public class Calculator
{
    public static void main(String args[])
    {
        Cal aa=new Cal();
        aa.addition();
        aa.substraction();
        aa.mul();
        aa.div();
    }
}