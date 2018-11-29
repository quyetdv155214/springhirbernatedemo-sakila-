package quyet.demo.spring.model;

public class Employee {

  private long empId;
  private java.sql.Date endDate;
  private String firstName;
  private String lastName;
  private java.sql.Date startDate;
  private String title;
  private long assignedBranchId;
  private long deptId;
  private long superiorEmpId;


  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
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


  public long getAssignedBranchId() {
    return assignedBranchId;
  }

  public void setAssignedBranchId(long assignedBranchId) {
    this.assignedBranchId = assignedBranchId;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public long getSuperiorEmpId() {
    return superiorEmpId;
  }

  public void setSuperiorEmpId(long superiorEmpId) {
    this.superiorEmpId = superiorEmpId;
  }

}
