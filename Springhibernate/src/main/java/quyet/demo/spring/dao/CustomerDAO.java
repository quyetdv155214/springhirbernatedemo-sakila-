package quyet.demo.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import quyet.demo.spring.model.Customer_old;

import java.util.List;

public class CustomerDAO implements BaseDAO {
    private SessionFactory sessionFactory;

    public void save(final Customer_old customer) {
        Session session;

        try {
            session = this.sessionFactory.getCurrentSession();
        }catch (Exception e){
            session = this.sessionFactory.openSession();
        }
        session.save(customer);
    }

    public void update(final Customer_old customer) {
        Session session;

        try {
            session = this.sessionFactory.getCurrentSession();
        }catch (Exception e){
            session = this.sessionFactory.openSession();
        }
        session.update(customer);
    }

    public Customer_old findById(final int id) {
        Session session;

        try {
            session = this.sessionFactory.getCurrentSession();
        }catch (Exception e){
            session = this.sessionFactory.openSession();
        }
        return session.get(Customer_old.class, id);
    }

    public void delete(final Customer_old customer) {
        Session session;

        try {
            session = this.sessionFactory.getCurrentSession();
        }catch (Exception e){
            session = this.sessionFactory.openSession();
        }
        session.delete(customer);
    }

    public List<Customer_old> findAll() {
        Session session;

        try {
            session = this.sessionFactory.getCurrentSession();
        }catch (Exception e){
            session = this.sessionFactory.openSession();
        }
        return session.createQuery("FROM Customer_old", Customer_old.class).getResultList();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
