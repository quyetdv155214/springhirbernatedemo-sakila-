package quyet.demo.spring.service;

import quyet.demo.spring.model.Product;
import quyet.demo.spring.service.base.BaseService;

import java.util.List;

public interface ProductService extends BaseService<Integer, Product> {
//    void deleteProductById(int productId);
    Product findByCode(String code);

    List<Product> getAllProduct();
}
