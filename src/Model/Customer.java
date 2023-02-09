package Model;

import java.util.regex.Pattern;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String email;

    private String emailRegex="^(.+)@(.+).(.+)$";
    private Pattern pattern=Pattern.compile(emailRegex);

    public Customer(String email, String firstName, String lastName) {
        if (!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Enter a Valid Email Address");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }



    public String getLastName() {
        return this.lastName;
    }



    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
