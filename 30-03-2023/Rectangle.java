/* lab Question 30-3-2023
Question:  Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth
 of the rectangle.
Print the area and perimeter of a rectangle
*/

class Rectangle
{
    int length,breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    void cal_area()
    {
        int area=length*breadth;
        System.out.println("Area of rectangle is:"+area);
    }

    void cal_perimeter()
    {
        int perimeter=2*(length+breadth);
        System.out.println("perimeter of Rectangle is:"+perimeter);
    }

    public static void main(String args[])
    {
        Rectangle re=new Rectangle(5,10);
        re.cal_area();
        re.cal_perimeter();
    }
    

}