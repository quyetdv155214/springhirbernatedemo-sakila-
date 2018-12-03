package quyet.demo.spring.model;


import javax.persistence.ManyToMany;
import java.util.List;

public class Store {

    private int storeId;
    private String storeName;
    private List<Address> addresses;

    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }



}
