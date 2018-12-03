package quyet.demo.spring.dao.impl;


import quyet.demo.spring.dao.StoreDAO;
import quyet.demo.spring.dao.base.GenericDAO;
import quyet.demo.spring.model.Store;

import java.util.List;

public class StoreDAOImpl extends GenericDAO<Integer, Store> implements StoreDAO {


    public List<Store> getAllStore() {
    	List<Store> list= getSession().createQuery("From Store").list();
    	System.out.println(list);
         return list;
    }
}
