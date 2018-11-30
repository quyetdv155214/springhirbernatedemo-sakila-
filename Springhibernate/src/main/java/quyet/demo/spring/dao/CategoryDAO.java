package quyet.demo.spring.dao;


import quyet.demo.spring.dao.base.BaseDAO;
import quyet.demo.spring.model.Category;

import java.util.List;

public interface CategoryDAO extends BaseDAO<Integer, Category> {
    List getAllCategory();

}
