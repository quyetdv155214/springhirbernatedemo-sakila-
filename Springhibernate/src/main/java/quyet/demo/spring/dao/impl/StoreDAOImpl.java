package quyet.demo.spring.dao.impl;


import quyet.demo.spring.dao.StoreDAO;
import quyet.demo.spring.dao.base.GenericDAO;
import quyet.demo.spring.model.Store;

import java.util.List;

public class StoreDAOImpl extends GenericDAO<Integer, Store> implements StoreDAO {


    public List<Store> getAllStore() {
         return getSession().createQuery("From quyet.demo.spring.model.Store").list();
    }
}
