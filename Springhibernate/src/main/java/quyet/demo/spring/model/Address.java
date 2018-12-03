package quyet.demo.spring.model;


public class Address {

  private int id;
  private int storeId;
  private String country;
  private String capital;
  private String address;
  private Store store;
  

  public Store getStore() {
	return store;
}

public void setStore(Store store) {
	this.store = store;
}

public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
