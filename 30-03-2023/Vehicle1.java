class Vehicle
{
    String brand,model;
    int year;
    public void drive()
    {
        System.out.println("driving the vehicle");
    }
}
class Car extends Vehicle //child class of vehicle
{
    String color;
    public void type()
    {
        System.out.println("this is car");
    }
}

class Vehicle1 //main class
{
    public static void main(String args[])
    {
        Car c=new Car(); //creating a object
        c.brand="Tata";
        c.model="indica";
        c.year=2012;
        c.color="White";

        c.drive(); //call method using object
        c.type();

    }
}