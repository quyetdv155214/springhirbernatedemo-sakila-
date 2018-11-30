package quyet.demo.spring.dao.impl;

import quyet.demo.spring.dao.ProductDAO;
import quyet.demo.spring.dao.base.GenericDAO;
import quyet.demo.spring.model.Product;

import java.util.List;

public class ProductDAOImpl extends GenericDAO<Integer, Product> implements ProductDAO {
    public Product findByCode(String code) {
        return (Product) getSession().createQuery("from Product where productCode = ?")
                .setParameter(0, code).getSingleResult();
    }

    public List<Product> getAllProduct() {
        return getSession().createQuery("from Product").list();
    }
}
