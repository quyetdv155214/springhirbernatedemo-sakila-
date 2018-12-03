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
        return categoryDAO.getAllCategory();
    }

    public Category findById(Serializable key) {
        return categoryDAO.findById(key);
    }

    public Category saveOrUpdate(Category entity) {
        return categoryDAO.saveOrUpdate(entity);
    }

    public boolean delete(Category entity) {
        return categoryDAO.delete(entity);
    }
}
