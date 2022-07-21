package rooms;

import hotel.Room;
import hotel.RoomType;

public class Bedroom extends Room {

    private RoomType roomtype;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber){
        super(roomType.getCapacity());
        this.roomtype = roomType;
        this.roomNumber = roomNumber;

    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
