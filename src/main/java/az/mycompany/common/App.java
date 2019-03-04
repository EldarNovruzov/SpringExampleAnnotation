/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.mycompany.common;

import az.mycompany.customer.services.inter.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Acer
 */
public class App {
    
    public static void main(String[] args) {
        ApplicationContext context= 
                new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});
        
        ICustomerService cust=(ICustomerService) context.getBean("customerService");
        System.out.println(cust.getUsers());
    }
}
