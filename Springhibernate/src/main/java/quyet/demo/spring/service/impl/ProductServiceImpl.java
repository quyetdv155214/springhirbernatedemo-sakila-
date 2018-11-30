package quyet.demo.spring.service.impl;


import quyet.demo.spring.dao.ProductDAO;
import quyet.demo.spring.model.Product;
import quyet.demo.spring.service.ProductService;

import java.io.Serializable;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Product findByCode(String code) {
        return null;
    }

    public List<Product> getAllProduct() {
        return null;
    }

    public Product findById(Serializable key) {
        return null;
    }

    public Product saveOrUpdate(Product entity) {
        return null;
    }

    public boolean delete(Product entity) {
        return false;
    }
}
