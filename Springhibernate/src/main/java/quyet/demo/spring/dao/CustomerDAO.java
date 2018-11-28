package quyet.demo.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import quyet.demo.spring.model.Customer;

import java.util.List;

public class CustomerDAO implements BaseDAO {
    private SessionFactory sessionFactory;

    public void save(final Customer customer) {
        Session session = this.sessionFactory.openSession();
        session.save(customer);
    }

    public void update(final Customer customer) {
        Session session = this.sessionFactory.openSession();
        session.update(customer);
    }

    public Customer findById(final int id) {
        Session session = this.sessionFactory.openSession();
        return session.get(Customer.class, id);
    }

    public void delete(final Customer customer) {
        Session session = this.sessionFactory.openSession();
        session.remove(customer);
    }

    public List<Customer> findAll() {
        Session session = this.sessionFactory.openSession();
        return session.createQuery("FROM Customer", Customer.class).getResultList();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
