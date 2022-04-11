package de.vc.rest_demo3.api;

import de.vc.rest_demo3.entity.Customer;
import de.vc.rest_demo3.persistence.CustomerDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("/management")
public class CustomerRest {

    /**
     * Method to access all items in list with a http GET request
     * No params
     * Can be accessed using [project url]api/management/allCustomers
     * @return returns a list of all items
     */

    @Path("/allCustomers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> allCustomers(){

        return CustomerDB.allCustomers();
    }

    /**
     * Method to find a single item in list with a http GET request
     * param an integer representing the items ID
     * Can be accessed using [project url]api/management/findCustomerById/[customerID]
     * @return returns a list of all items
     */

    @Path("/findCustomerById/{customerID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer findCustomer(@PathParam("customerID") int customerID){
        Customer customer = CustomerDB.findCustomer(customerID);
        if (customer == null) return new Customer();
        return customer;
    }

    /**
     * Method to create a new item with a http POST request
     * param: a JSON representation of a new item in the requests body
     * Can be accessed using [project url]api/management/createCustomer
     * @return returns a list of all items
     */

    @Path("/createCustomer")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Customer> createCustomer(Customer newCustomer){
        return CustomerDB.createCustomer(newCustomer);
    }

    /**
     * Method to delete an item with a http DELETE request
     * param: an integer representing the items ID
     * Can be accessed using [project url]/api/management/deleteCustomer/[customerID]
     * @return returns a list of all items
     */

    @Path("/deleteCustomer/{customerID}")
    @DELETE
    public List<Customer> deleteCustomer(@PathParam("customerID") int customerID){
        return CustomerDB.deleteCustomer(customerID);
    }

    /**
     * Method to update an item with a http PUT request
     * param: a JSON representation of the edited item in the requests body
     * Can be accessed using [project url]api/management/updateCustomer
     * @return returns a list of all items
     */

    @Path("/updateCustomer")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Customer> updateCustomer(Customer editCustomer){
        return CustomerDB.updateCustomer(editCustomer);
    }

}