package quyet.demo.spring.service.impl;

import quyet.demo.spring.dao.AddressDAO;
import quyet.demo.spring.model.Address;
import quyet.demo.spring.service.AddressService;

import java.io.Serializable;
import java.util.List;

public class AddressServiceImpl implements AddressService {

    private AddressDAO addressDAO;

    public List<Address> getAddressByStoreId(int storeId) {
        return null;
    }

    public Address findById(Serializable key) {
        return null;
    }

    public Address saveOrUpdate(Address entity) {
        return null;
    }

    public boolean delete(Address entity) {
        return false;
    }

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }
}
