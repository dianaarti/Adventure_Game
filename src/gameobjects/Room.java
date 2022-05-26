package gameobjects;

public class Room extends Thing {
    public int north;
    public int south;
    public int west;
    public int east;


    public Room(String name, String description,int n,int s,int w,int e){

        super(name,description);
        this.north=n;
        this.south=s;
        this.east=e;
        this.west=w;

    }





}
