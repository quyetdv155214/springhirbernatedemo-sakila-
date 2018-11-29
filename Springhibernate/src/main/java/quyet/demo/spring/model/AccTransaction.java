package quyet.demo.spring.model;


public class AccTransaction {

  private long txnId;
  private double amount;
  private java.sql.Timestamp fundsAvailDate;
  private java.sql.Timestamp txnDate;
  private String txnTypeCd;
  private long accountId;
  private long executionBranchId;
  private long tellerEmpId;


  public long getTxnId() {
    return txnId;
  }

  public void setTxnId(long txnId) {
    this.txnId = txnId;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public java.sql.Timestamp getFundsAvailDate() {
    return fundsAvailDate;
  }

  public void setFundsAvailDate(java.sql.Timestamp fundsAvailDate) {
    this.fundsAvailDate = fundsAvailDate;
  }


  public java.sql.Timestamp getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(java.sql.Timestamp txnDate) {
    this.txnDate = txnDate;
  }


  public String getTxnTypeCd() {
    return txnTypeCd;
  }

  public void setTxnTypeCd(String txnTypeCd) {
    this.txnTypeCd = txnTypeCd;
  }


  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }


  public long getExecutionBranchId() {
    return executionBranchId;
  }

  public void setExecutionBranchId(long executionBranchId) {
    this.executionBranchId = executionBranchId;
  }


  public long getTellerEmpId() {
    return tellerEmpId;
  }

  public void setTellerEmpId(long tellerEmpId) {
    this.tellerEmpId = tellerEmpId;
  }

}
