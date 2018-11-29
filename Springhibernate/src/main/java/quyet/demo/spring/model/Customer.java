package quyet.demo.spring.model;



public class Customer {

  private long custId;
  private String address;
  private String city;
  private String custTypeCd;
  private String fedId;
  private String postalCode;
  private String state;


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getCustTypeCd() {
    return custTypeCd;
  }

  public void setCustTypeCd(String custTypeCd) {
    this.custTypeCd = custTypeCd;
  }


  public String getFedId() {
    return fedId;
  }

  public void setFedId(String fedId) {
    this.fedId = fedId;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
