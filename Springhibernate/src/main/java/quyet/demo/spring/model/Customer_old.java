package quyet.demo.spring.model;

public class Customer_old {
    private int id;
    private String name;
    private String address;

    public Customer_old() {
    }

    public Customer_old(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
