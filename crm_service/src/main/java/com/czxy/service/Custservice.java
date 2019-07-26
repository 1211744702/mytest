package com.czxy.service;

import com.czxy.dao.CustomerMapper;
import com.czxy.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 传智新星
 * @date : 2019/7/4  8:23
 */
@Transactional
@Service
public class Custservice {
   @Autowired
    private CustomerMapper custMapper;
public List<Customer>ShowAll(){
    List<Customer> list = custMapper.findAll();
    return  list;
}


    public void add(Customer customer) {
        custMapper.insert(customer);
    }

    public Customer findCustomerById(String id) {
        Customer customer = custMapper.selectByPrimaryKey(Integer.parseInt(id));
        return customer;
    }

    public void updateCustomer(Customer customer) {
        custMapper.updateByPrimaryKey(customer);
    }


    public void deleteCustomer(Integer id) {
        custMapper.deleteByPrimaryKey((id));
    }

}
