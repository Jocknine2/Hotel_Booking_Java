package hotel;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private RoomType roomType;
    private ArrayList<Guest>guests;

    public Room(, int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }
    public RoomType getRoomType(){
        return this.roomType;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

}