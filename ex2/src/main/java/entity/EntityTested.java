/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author jacobsimonsen
 */
public class EntityTested {
    
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");      
    Facade facade = CustomerFacade.getCustomerFacade(emf);
    Customer c1 = facade.addCustomer("Hans", "hansen", Date);
    Customer c2 = facade.addCustomer("bent", "bentsen", Date);



        
    }
    
}
