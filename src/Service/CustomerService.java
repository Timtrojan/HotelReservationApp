package Service;

import Model.Customer;

import java.util.Collection;

public class CustomerService {
    private static final CustomerService CUSTOMER_SERVICE= new CustomerService();


    private CustomerService(){}

    public void addCustomer(String email, String firstName, String lastName){



    }
    public Customer getCustomer(String customerEmail){

    }
    public Collection<Customer> getAllCustomers(){

    }

    public static CustomerService getCustomerService(){
        return CUSTOMER_SERVICE;
    }
}
