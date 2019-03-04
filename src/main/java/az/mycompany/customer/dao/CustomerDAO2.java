/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.mycompany.customer.dao;

import az.company.beans.User;
import az.mycompany.customer.dao.inter.ICustomerDAO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */

@Repository(value="dao2")
public class CustomerDAO2 implements ICustomerDAO{

    @Override
    public String toString() {
        return "Hello I am CustomerDAO";
    }

    @Override
    public List<User> getUsers() {
        System.out.println("dao 2 started");
     List<User> list=new ArrayList<>();
     list.add(new User("Eldar"));
       return list;
    }
    
    
}
