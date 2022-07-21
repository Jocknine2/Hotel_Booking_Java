package hotel;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    SMALL_CONFERENCE(10),
    LARGE_CONFERENCE(20);

    private final int capacity;


    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}