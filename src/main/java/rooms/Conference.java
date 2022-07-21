package rooms;

import hotel.Room;
import hotel.RoomType;

public class Conference extends Room {

    private final RoomType roomtype;
    private String roomName;

    public Conference(RoomType roomType, String roomName){
        super(roomType.getCapacity());
        this.roomtype = roomType;
        this.roomName = roomName;
    }
}
