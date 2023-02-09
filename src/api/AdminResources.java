package api;

import Model.Customer;
import Model.IRoom;
import Service.CustomerService;
import Service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResources {
    private static final AdminResources ADMIN_RESOURCES=new AdminResources();
    private final CustomerService customerService = CustomerService.getCustomerService();
    private final ReservationService reservationService = ReservationService.getReservationService();


    private AdminResources() {}

    public static AdminResources getAdminResources() {
        return ADMIN_RESOURCES;
    }

    public Customer getCustomer(String email) {

    }

    public void addRoom(List<IRoom> rooms) {

    }

    public Collection<IRoom> getAllRooms() {

    }

    public Collection<Customer> getAllCustomers() {

    }

    public void displayAllReservations() {

    }
}

