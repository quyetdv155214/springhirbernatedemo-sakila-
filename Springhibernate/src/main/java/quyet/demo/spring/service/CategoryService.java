package quyet.demo.spring.service;

import quyet.demo.spring.model.Category;
import quyet.demo.spring.service.base.BaseService;

import java.util.List;

public interface CategoryService extends BaseService<Integer, Category> {
    List<Category> getAllCategory();
}
