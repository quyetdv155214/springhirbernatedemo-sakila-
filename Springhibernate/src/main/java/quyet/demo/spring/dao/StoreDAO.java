package quyet.demo.spring.dao;



import quyet.demo.spring.dao.base.BaseDAO;
import quyet.demo.spring.model.Store;

import java.util.List;

public interface StoreDAO extends BaseDAO<Integer, Store> {

    List<Store> getAllStore();
}
