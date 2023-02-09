package Model;

public class FreeRoom extends Room{
    private final String roomNumber;
    private final RoomType roomType;
    private final Double roomPrice;

    public FreeRoom(String roomNumber, Double roomPrice, RoomType roomType) {
        super(roomNumber, roomPrice, roomType);
        this.roomNumber=roomNumber;
        this.roomPrice=0.0;
        this.roomType=roomType;
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType=" + roomType +
                ", roomPrice=" + roomPrice +
                '}';
    }


}
