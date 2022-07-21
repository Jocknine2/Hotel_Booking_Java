package rooms;

import hotel.Room;
import hotel.RoomType;

public class Conference extends Room {

    private RoomType capacity;
    private RoomType roomNumber;

    public Conference(RoomType roomType, RoomType capacity, RoomType roomNumber){
        super(roomType);
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }
}
