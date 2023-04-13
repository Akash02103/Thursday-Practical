/* Write a program to create thread. Where you will take the input from the user 
and find if the number is odd or even. */

import java.util.*;

class ThreadEx extends Thread  //creating thread
{
    public void run()
    {
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in); // taking user input
        int num=obj.nextInt();

        if(num % 2==0)
        {
            System.out.println("The number  is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }
}

public class UseThreadEx //main class
{
    public static void main(String args[])
    {
        ThreadEx th=new ThreadEx(); //creating object 
        th.start();

    }
}
