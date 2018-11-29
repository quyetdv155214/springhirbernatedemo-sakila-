package quyet.demo.spring.dao;

import quyet.demo.spring.model.Customer_old;

import java.util.List;

public interface BaseDAO {
    void save(Customer_old customer);

    void update(Customer_old customer);

    Customer_old findById(int id);

    void delete(Customer_old customer);

    List<Customer_old> findAll();
}
