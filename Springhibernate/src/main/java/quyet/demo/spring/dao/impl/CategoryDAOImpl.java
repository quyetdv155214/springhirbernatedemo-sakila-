package quyet.demo.spring.dao.impl;

import quyet.demo.spring.dao.CategoryDAO;
import quyet.demo.spring.dao.base.GenericDAO;
import quyet.demo.spring.model.Category;

import java.util.List;

public class CategoryDAOImpl extends GenericDAO<Integer, Category> implements CategoryDAO {


    public List getAllCategory() {
        return getSession().createQuery("from quyet.demo.spring.model.Category").list();
    }
}
