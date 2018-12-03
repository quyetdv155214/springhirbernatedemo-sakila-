package quyet.demo.spring.model;


import java.util.List;

public class Product {

  private long productId;
  private String productName;
  private String productCode;
  private double productPrice;
  private long branchId;

  private List<Category> categories;
  private List<Store> stores;


  
  public List<Store> getStores() {
	return stores;
}

public void setStores(List<Store> stores) {
	this.stores = stores;
}

public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public long getBranchId() {
    return branchId;
  }

  public void setBranchId(long branchId) {
    this.branchId = branchId;
  }

  @Override
  public String toString() {
    return "Product{" +
            "productId=" + productId +
            ", productName='" + productName + '\'' +
            ", productCode='" + productCode + '\'' +
            ", productPrice=" + productPrice +
            ", branchId=" + branchId +
            ", categories=" + categories +
            '}';
  }
}
