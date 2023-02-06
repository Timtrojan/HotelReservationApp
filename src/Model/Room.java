package Model;

public class Room implements IRoom {
    private final String roomNumber;
    private Double roomPrice;
    private final RoomType roomType;

    public Room(String roomNumber, Double roomPrice, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomType = roomType;
    }

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public Boolean isFree() {
        return true;
    }
    @Override
    public String toString(){

        return String.format("""
                Room Number: %s
                Price Per Night:%s
                Selected Room Type: %s
                
                """, roomNumber,roomPrice,roomType);
    }
}
