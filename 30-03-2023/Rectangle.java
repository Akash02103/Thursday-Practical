/* lab Question 30-3-2023
Question:  Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth
 of the rectangle.
Print the area and perimeter of a rectangle
*/

// A class to represent a Rectangle
class Rectangle {
    int length, breadth;

    // Constructor to initialize length and breadth of rectangle
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of rectangle
    void cal_area() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }

    // Method to calculate perimeter of rectangle
    void cal_perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }

 
    public static void main(String args[]) {
        // Create an instance of Rectangle with length 5 and breadth 10
        Rectangle re = new Rectangle(5, 10);

        // Call the cal_area method to print area of the rectangle
        re.cal_area();

        // Call the cal_perimeter method to print perimeter of the rectangle
        re.cal_perimeter();
    }
}


}
