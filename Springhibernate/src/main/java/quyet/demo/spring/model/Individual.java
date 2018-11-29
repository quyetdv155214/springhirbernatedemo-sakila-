package quyet.demo.spring.model;


public class Individual {

  private java.sql.Date birthDate;
  private String firstName;
  private String lastName;
  private long custId;


  public java.sql.Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(java.sql.Date birthDate) {
    this.birthDate = birthDate;
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


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }

}
