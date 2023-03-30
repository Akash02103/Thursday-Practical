//lab Question 30-3-2023
/*Question:- Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 values 
method with 3 parameters should be called */

// A class to demonstrate method overloading in Java
class Overload {
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Add method with 2 parameter");
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        System.out.println("Add method with 3 parameter");
    }

  
    public static void main(String args[]) {
        Overload o = new Overload();

        // Call the add method with two integer parameters
        o.add(2, 3);

        // Call the add method with three integer parameters
        o.add(1, 2, 3);
    }
}
