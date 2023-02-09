package api;

import Model.Customer;
import Model.IRoom;
import Model.Reservation;
import Service.CustomerService;
import Service.ReservationService;

import java.util.Collection;
import java.util.Date;

public class HotelResources {
    private static final HotelResources HOTEL_RESOURCES=new HotelResources();
    private final CustomerService customerService = CustomerService.getCustomerService();
    private final ReservationService reservationService = ReservationService.getReservationService();

    private HotelResources(){

    }

    public static HotelResources getHotelResources() {

        return HOTEL_RESOURCES;
    }
    public Customer getCustomer(String email){

    }
    public void createACustomer(String email, String firstName, String lastName){

    }
    public IRoom getRoom(String roomNumber){

    }
    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){

    }
    public Collection<Reservation>getCustomerReservations(String customerEmail){

    }
    public Collection<IRoom>findARoom(Date checkin, Date checkOut){

    }

}