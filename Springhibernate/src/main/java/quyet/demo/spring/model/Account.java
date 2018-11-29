package quyet.demo.spring.model;


public class Account {

  private long accountId;
  private double availBalance;
  private java.sql.Date closeDate;
  private java.sql.Date lastActivityDate;
  private java.sql.Date openDate;
  private double pendingBalance;
  private String status;
  private long custId;
  private long openBranchId;
  private long openEmpId;
  private String productCd;


  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }


  public double getAvailBalance() {
    return availBalance;
  }

  public void setAvailBalance(double availBalance) {
    this.availBalance = availBalance;
  }


  public java.sql.Date getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(java.sql.Date closeDate) {
    this.closeDate = closeDate;
  }


  public java.sql.Date getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(java.sql.Date lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }


  public java.sql.Date getOpenDate() {
    return openDate;
  }

  public void setOpenDate(java.sql.Date openDate) {
    this.openDate = openDate;
  }


  public double getPendingBalance() {
    return pendingBalance;
  }

  public void setPendingBalance(double pendingBalance) {
    this.pendingBalance = pendingBalance;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }


  public long getOpenBranchId() {
    return openBranchId;
  }

  public void setOpenBranchId(long openBranchId) {
    this.openBranchId = openBranchId;
  }


  public long getOpenEmpId() {
    return openEmpId;
  }

  public void setOpenEmpId(long openEmpId) {
    this.openEmpId = openEmpId;
  }


  public String getProductCd() {
    return productCd;
  }

  public void setProductCd(String productCd) {
    this.productCd = productCd;
  }

}
