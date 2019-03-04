/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.mycompany.customer.services;

import az.company.beans.User;
import az.mycompany.customer.dao.inter.ICustomerDAO;
import az.mycompany.customer.services.inter.ICustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */


@Service
public class CustomerService implements ICustomerService{
    @Autowired
            @Qualifier(value="dao1")
            ICustomerDAO customerDAO;//loosely coupling, thiht coupling

    @Override
    public String toString() {
        return "CustomerService{" + "customerDAO=" + customerDAO + '}';
    }

    @Override
    public List<User> getUsers() {
        List<User> list=customerDAO.getUsers();
        for (User u: list) {
            System.out.println(u);
        }
        return list;
    }
    
            
}
