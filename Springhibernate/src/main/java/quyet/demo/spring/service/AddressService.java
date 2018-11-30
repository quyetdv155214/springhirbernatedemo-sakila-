package quyet.demo.spring.service;


import quyet.demo.spring.model.Address;
import quyet.demo.spring.service.base.BaseService;

import java.util.List;

public interface AddressService extends BaseService<Integer, Address> {
    List<Address> getAddressByStoreId(int storeId);

}
