package quyet.demo.spring.service.impl;

import quyet.demo.spring.dao.AddressDAO;
import quyet.demo.spring.model.Address;
import quyet.demo.spring.service.AddressService;

import java.io.Serializable;
import java.util.List;

public class AddressServiceImpl implements AddressService {

    private AddressDAO addressDAO;

    public List<Address> getAddressByStoreId(int storeId) {
        return addressDAO.getAddressByStoreId(storeId);
    }

    public Address findById(Serializable key) {
        return addressDAO.findById(key);
    }

    public Address saveOrUpdate(Address entity) {
        return addressDAO.saveOrUpdate(entity);
    }

    public boolean delete(Address entity) {
        return addressDAO.delete(entity);
    }

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }
}
