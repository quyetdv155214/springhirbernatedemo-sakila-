package quyet.demo.spring.model;



public class Officer {

  private long officerId;
  private java.sql.Date endDate;
  private String firstName;
  private String lastName;
  private java.sql.Date startDate;
  private String title;
  private long custId;


  public long getOfficerId() {
    return officerId;
  }

  public void setOfficerId(long officerId) {
    this.officerId = officerId;
  }


  public java.sql.Date getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Date endDate) {
    this.endDate = endDate;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }

}
