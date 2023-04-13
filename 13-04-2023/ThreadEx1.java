/* Create two thread.one thread is finding average of first 50 numbers and 
other thread is printing square of number store in array arr={10,15,20,25,30}. */

class MyThread1 extends Thread //creating thread
{
    public void run()
    {
        int sum = 0;
        for (int i = 1; i <= 50; i++) 
        {
            sum=sum + i;
        }
        double average = (double) sum / 50;
        System.out.println("Average of first 50 numbers is: " + average);
    }
}

class MyThread2 extends Thread //creating thread
{
    public void run()
    {
        int[] arr = {10, 15, 20, 25, 30};

        for (int i = 0; i < arr.length; i++)
        {
            int square = arr[i] * arr[i];
            System.out.println("Square of " + arr[i] + ": " + square);
        }
    }

}

public class ThreadEx1 //main class
{
    public static void main(String args[])
    {
        MyThread1 th=new MyThread1(); //creating object for thread1
        th.start();

        MyThread2 th1=new MyThread2(); //creating object for thread2
        th1.start();
    }
}