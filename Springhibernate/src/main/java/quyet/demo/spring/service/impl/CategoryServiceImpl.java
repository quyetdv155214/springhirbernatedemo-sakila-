package quyet.demo.spring.service.impl;


import quyet.demo.spring.dao.CategoryDAO;
import quyet.demo.spring.model.Category;
import quyet.demo.spring.service.CategoryService;

import java.io.Serializable;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDAO categoryDAO;

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public List<Category> getAllCategory() {
        return null;
    }

    public Category findById(Serializable key) {
        return null;
    }

    public Category saveOrUpdate(Category entity) {
        return null;
    }

    public boolean delete(Category entity) {
        return false;
    }
}
