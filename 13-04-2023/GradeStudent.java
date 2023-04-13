/*1. Write a program to take input of marks of 3 subjects from the user. 
  Check if the total of marks given by the user is greater than 
  50 else throw an exception saying "You Failed". Or else print Grade 
  is A if the total is greater than 280. Grade B if the total is greater 
  than 200. Grade C if the total is greater than 150. Grade D if the total is greater than 50.*/

import java.util.Scanner;

public class GradeStudent
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");// taking 1st user input
        int sub1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: "); // taking 2nd user input
        int sub2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: "); //taking 3rd user input
        int sub3 = scanner.nextInt();

        int total = sub1 + sub2 + sub3; //calculate total marks
        if (total <= 50) 
        {
            throw new IllegalArgumentException("You Failed");
        } 
        else if (total > 280) //if total marks greater than 280 print grade A
        {
            System.out.println("Grade is A");
        } 
        else if (total > 200) //if total marks greater than 200 print grade B
        {
            System.out.println("Grade is B");
        }
        else if (total > 150) //if total marks greater than 150 print grade C
        {
            System.out.println("Grade is C");
        } 
        else 
        {
            System.out.println("Grade is D"); //if total marks greater than 50 print grade D
        }
    }
}