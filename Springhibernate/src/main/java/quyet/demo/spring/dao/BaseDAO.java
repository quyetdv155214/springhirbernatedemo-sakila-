package quyet.demo.spring.dao;

import quyet.demo.spring.model.Customer;

import java.util.List;

public interface BaseDAO {
    void save(Customer customer);

    void update(Customer customer);

    Customer findById(int id);

    void delete(Customer customer);

    List<Customer> findAll();
}
