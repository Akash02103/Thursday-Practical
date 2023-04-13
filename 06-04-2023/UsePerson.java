/*write a program using constructor. create a class Person with Id, Name, Designation. 
Ask the user what are his inputs and according to that call the constructor*/


import java.util.Scanner;

class Person
{
    int id;
    String name;
    String Designation;

    Person(int id,String name,String Designation) //constructor
    {
        this.id=id;
        this.name=name;
        this.Designation=Designation;
        System.out.println(" this Constructor has 3 paramerte");
    }

    Person(int id ,String name) //comstructor
    {
        this.id=id;
        this.name=name;  
        System.out.println("this constructor has 2 parameter"); 
    }

    Person(int id) //constructor
    {
        this.id=id;
    }

    void print()
    {
        System.out.println("the id is:"+id);
        System.out.println("the name is:"+name);
        System.out.println("the Designation is:"+Designation);

    }
}

class UsePerson
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the id:");
        int id=sc.nextInt();

        System.out.println("enter the name:");
        String name=sc.next();

        System.out.println("enter the Designation:");
        String Designation=sc.next();

        Person p=new Person(id,name); //creating object for constructor
        p.print();   //call the print method using object   
    }
}