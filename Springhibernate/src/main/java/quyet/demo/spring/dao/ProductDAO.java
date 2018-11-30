package quyet.demo.spring.dao;


import quyet.demo.spring.dao.base.BaseDAO;
import quyet.demo.spring.model.Product;

import java.util.List;

public interface ProductDAO extends BaseDAO<Integer, Product> {

    Product findByCode(String code);

    List<Product> getAllProduct();
}
