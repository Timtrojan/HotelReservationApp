package Service;

import Model.Customer;
import Model.IRoom;
import Model.Reservation;

import java.util.Collection;
import java.util.Date;

public class ReservationService {
    private static final ReservationService RESERVATION_SERVICE= new ReservationService();

    private ReservationService(){}

    public static ReservationService getReservationService(){
         return RESERVATION_SERVICE;
    }

    public void addRoom(IRoom room){}
    public IRoom getARoom(String roomId){}
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){

    }
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){}

    public Collection<Reservation> getCustomersReservation(Customer customer){}

    public void printAllReservation(){

    }

}
