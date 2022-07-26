package hotel;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private RoomType roomType;
    private final ArrayList<Guest>guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }
    public RoomType getRoomType(){
        return this.roomType;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests(){
        return guests.size();
    }

    public void addGuestToRoom(Guest guest){
        guests.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        guests.remove(guest);
    }


}