/*Create an interface called ""Playable"" with a method called ""play"". 
Create two classes called ""Song"" and ""Video"" that implement the Playable interface and 
implement the ""play"" method. Create objects of both the Song and Video classes and call 
their respective ""play"" methods.*/

interface Playable 
{
    void play();
}

class Song implements Playable 
{
    public void play() 
    {
        System.out.println("This is a play method of class song");
    }
}

class Video implements Playable 
{
    public void play() 
    {
        System.out.println("This is a play method of class video");
    }
}

public class UsePlayable 
{
    public static void main(String[] args) 
    {
        Song obj1 = new Song(); //creating object of class song
        obj1.play();

        Video obj2 = new Video(); //creating object of class Video
        obj2.play();
    }
}