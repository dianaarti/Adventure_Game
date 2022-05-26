import gameobjects.*;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Main {

    public ArrayList<Room> myrooms;
    public static Scanner input = new Scanner(System.in);
    public int poz;


    public Main(){
        myrooms= new ArrayList<Room>(6);
        poz=0;
        myrooms.add(0,new Room("EntryRoom","This is the first room from the house",1,-1,2,4));
        myrooms.add(1,new Room("Kitchen","This is where you find the food and water",-1,0,-1,-1));
        myrooms.add(2,new Room("LivingRoom","This is where you can find the TV and a couch",-1,-1,-1,0));
        myrooms.add(3,new Room("BedRoom","This is where you sleep at night",-1,4,-1,-1));
        myrooms.add(4,new Room("Vestibule","This is a small room that connects some rooms",3,-1,0,5));
        myrooms.add(5,new Room("BathRoom","Here is the bathroom",-1,-1,-1,4));

    }


    public static void main(String[] args) {
	// write your code here
        Main game=new Main();
        Boolean newroom=true;

        System.out.println("Welcome to the Adventure House. To get help, press help.");
        System.out.println("Your first quest is to explore the house.");
        while (true){
            Room r = game.myrooms.get(game.poz);

            if (newroom) System.out.println("You are in the "+r.name+". "+ r.description);
            newroom=false;

            String command=input.nextLine();

            if (command.equals("help")){
                System.out.println("To exit the game press q. To go north, south, east or west press n,s,e or w.");
            }
            if (command.equals("q")){
                System.out.println("You selected to exit the house. Good bye!");
                break;
            }
            if (command.equals("n")){
                if (r.north!=-1){
                    game.poz =r.north;
                    System.out.println("You went north.");
                    newroom=true;
                }
                else
                    System.out.println("There is no door in that direction. Choose another direction (n/s/e/w).");
            }
            else if (command.equals("s")){
                if (r.south!=-1){
                    game.poz =r.south;
                    System.out.println("You went south.");
                    newroom=true;
                }
                else
                    System.out.println("There is no door in that direction. Choose another direction (n/s/e/w).");
            }
            else if (command.equals("w")){
                if (r.west!=-1){
                    game.poz =r.west;
                    System.out.println("You went west.");
                    newroom=true;
                }
                else
                    System.out.println("There is no door in that direction. Choose another direction (n/s/e/w).");
            }
            else if (command.equals("e")){
                if (r.east!=-1){
                    game.poz =r.east;
                    System.out.println("You went east.");
                    newroom=true;
                }
                else
                    System.out.println("There is no door in that direction. Choose another direction (n/s/e/w).");
            }
        }

    }
}
