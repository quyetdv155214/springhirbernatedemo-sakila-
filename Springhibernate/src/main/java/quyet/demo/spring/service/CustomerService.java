package quyet.demo.spring.service;

import quyet.demo.spring.dao.CustomerDAO;
import quyet.demo.spring.model.Customer_old;

import java.util.List;

public class CustomerService {
    private CustomerDAO customerDAO;

    public List<Customer_old> findAll() {
        return customerDAO.findAll();
    }

    public Customer_old findById(final int id) {
        return customerDAO.findById(id);
    }

    public void save(final Customer_old customer) {
        customerDAO.save(customer);
    }

    public void update(final Customer_old customer) {
        customerDAO.update(customer);
    }

    public void delete(final int id) {
        Customer_old customer = customerDAO.findById(id);
        if (customer != null) {
            customerDAO.delete(customer);
        }
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
