package quyet.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import quyet.demo.spring.dao.CustomerDAO;
import quyet.demo.spring.model.Customer;

import java.util.List;

public class CustomerService {
    private CustomerDAO customerDAO;

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    public Customer findById(final int id) {
        return customerDAO.findById(id);
    }

    public void save(final Customer customer) {
        customerDAO.save(customer);
    }

    public void update(final Customer customer) {
        customerDAO.update(customer);
    }

    public void delete(final int id) {
        Customer customer = customerDAO.findById(id);
        if (customer != null) {
            customerDAO.delete(customer);
        }
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
