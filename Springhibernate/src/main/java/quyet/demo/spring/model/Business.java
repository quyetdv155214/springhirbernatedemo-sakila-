package quyet.demo.spring.model;



public class Business {

  private java.sql.Date incorpDate;
  private String name;
  private String stateId;
  private long custId;


  public java.sql.Date getIncorpDate() {
    return incorpDate;
  }

  public void setIncorpDate(java.sql.Date incorpDate) {
    this.incorpDate = incorpDate;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }

}
