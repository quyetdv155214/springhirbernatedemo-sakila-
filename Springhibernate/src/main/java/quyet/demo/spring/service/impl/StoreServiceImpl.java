package quyet.demo.spring.service.impl;

import quyet.demo.spring.dao.StoreDAO;
import quyet.demo.spring.model.Store;
import quyet.demo.spring.service.StoreService;

import java.io.Serializable;
import java.util.List;

public class StoreServiceImpl implements StoreService {
    private StoreDAO storeDAO;

    public void setStoreDAO(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    public List<Store> getAllStore() {
        return null;
    }

    public Store findById(Serializable key) {
        return null;
    }

    public Store saveOrUpdate(Store entity) {
        return null;
    }

    public boolean delete(Store entity) {
        return false;
    }
}
