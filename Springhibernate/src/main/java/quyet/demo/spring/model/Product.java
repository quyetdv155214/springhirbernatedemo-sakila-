package quyet.demo.spring.model;



public class Product {

  private String productCd;
  private java.sql.Date dateOffered;
  private java.sql.Date dateRetired;
  private String name;
  private String productTypeCd;


  public String getProductCd() {
    return productCd;
  }

  public void setProductCd(String productCd) {
    this.productCd = productCd;
  }


  public java.sql.Date getDateOffered() {
    return dateOffered;
  }

  public void setDateOffered(java.sql.Date dateOffered) {
    this.dateOffered = dateOffered;
  }


  public java.sql.Date getDateRetired() {
    return dateRetired;
  }

  public void setDateRetired(java.sql.Date dateRetired) {
    this.dateRetired = dateRetired;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getProductTypeCd() {
    return productTypeCd;
  }

  public void setProductTypeCd(String productTypeCd) {
    this.productTypeCd = productTypeCd;
  }

}
