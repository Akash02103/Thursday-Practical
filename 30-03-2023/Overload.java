//lab Question 30-3-2023
/*Question:- Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 values 
method with 3 parameters should be called */

class Overload
{
    
    public void add(int a,int b)
    {
        System.out.println("Add method with 2 parameter");
    }

     public void add(int a,int b,int c)
    {
        System.out.println("Add method with 3 parameter");
    }

    public static void main(String args[])
    {
        Overload o=new Overload();
        o.add(2,3);
        o.add(1,2,3);
    }
}
