/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.mycompany.customer.dao.inter;

import az.company.beans.User;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface ICustomerDAO {
    public List<User> getUsers();
}
