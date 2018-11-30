package quyet.demo.spring.service;


import quyet.demo.spring.model.Store;
import quyet.demo.spring.service.base.BaseService;

import java.util.List;

public interface StoreService extends BaseService<Integer, Store> {
    List<Store> getAllStore();
}
