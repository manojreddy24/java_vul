/*public class Main
{
	public static void main(String[] args) {
	  String fir = "manoj ";
    System.out.println("name is: " + fir);
		System.out.println("Hello World");
	}
}
*/

/*public abstract class NFLPlayersReference {

    private static Runningback[] nflplayersreference;

    private static Quarterback[] players;

    private static WideReceiver[] nflplayers;

    public static void main(String args[]){

    Runningback r = new Runningback("Thomlinsion");

    Quarterback q = new Quarterback("Tom Brady");

    WideReceiver w = new WideReceiver("Steve Smith");

    NFLPlayersReference[] NFLPlayersReference;


        Run();// {

        NFLPlayersReference = new NFLPlayersReference [3];

        nflplayersreference[0] = r;

        players[1] = q;

        nflplayers[2] = w;
 

            for ( int i = 0; i < nflplayersreference.length; i++ ) {

            System.out.println("My name is " + " nflplayersreference[i].getName());

            nflplayersreference[i].run();

            nflplayersreference[i].run();

            nflplayersreference[i].run();

            System.out.println("NFL offensive threats have great running abilities!");

        }

    }

    private static void Run() {

        System.out.println("Not yet implemented");

    }     
 
}
*/

/*public class Main
{
	public static void main(String[] args) {
	  boolean b = true;
		while(b)
		{
   
		System.out.println("Hello World");
		}
	}
}

*/



package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Name {
    public static void main(String[] args) throws IOException {

        String s1="manoj";
        String s2 = "reddy";
        System.out.println(s1==s2);

        boolean v = true;
        while(v){System.out.println("1");}


        File file = new File("C:\\demo\\demofile.txt");
        FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
        System.out.println("file content: ");
        int r=0;
        while((r=fis.read())!=-1)
        {
            System.out.print((char)r);      //prints the content of the file
        }
    }
}
