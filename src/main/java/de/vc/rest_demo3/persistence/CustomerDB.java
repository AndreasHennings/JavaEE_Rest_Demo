package de.vc.rest_demo3.persistence;

import de.vc.rest_demo3.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    private static List <Customer> customers = new ArrayList<>();

    public static Customer findCustomer(int id){
        Customer customer = null;
        for (Customer c : customers){
            if (c.getCustomerID()==id){
                customer = c;
            }
        }
        return customer;
    }

    public static List<Customer> allCustomers(){
        return customers;
    }


    public static List<Customer> createCustomer(Customer customer) {
        customers.add(customer);
        return customers;
    }

    public static List<Customer> deleteCustomer(int customerID) {
        for (int i = 0; i<customers.size();i++){
            if (customers.get(i).getCustomerID()==customerID){
                customers.remove(i);
            }
        }
        return customers;
    }

    public static List<Customer> updateCustomer(Customer editCustomer) {

        for (int i = 0; i<customers.size(); i++){
            if (customers.get(i).getCustomerID()==editCustomer.getCustomerID()){
                customers.remove(i);
                customers.add(editCustomer);
            }
        }
        return customers;
    }
}
