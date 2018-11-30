package quyet.demo.spring.dao;


import quyet.demo.spring.dao.base.BaseDAO;
import quyet.demo.spring.model.Address;

import java.util.List;

public interface AddressDAO extends BaseDAO<Integer, Address> {
    List<Address> getAddressByStoreId(int storeId);

}
