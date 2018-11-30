package quyet.demo.spring.dao.impl;


import org.hibernate.query.Query;
import quyet.demo.spring.dao.AddressDAO;
import quyet.demo.spring.dao.base.GenericDAO;
import quyet.demo.spring.model.Address;

import java.util.List;

public class AddressDAOImpl extends GenericDAO<Integer, Address> implements AddressDAO {

    public List<Address> getAddressByStoreId(int storeId) {

        Query query = getSession()
                .createQuery("From Address where storeId = ?")
                .setParameter(0, storeId);


        return (List<Address>) query.list();
    }
}
