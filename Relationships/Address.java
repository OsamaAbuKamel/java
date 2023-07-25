package Relationships;

public class Address {
    private int streetAddress;
    private String city;
    private String state;

    public Address() {
    }

    public Address(int streetAddress, String city, String state) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public int getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(int streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                " streetAddress='" + getStreetAddress() + "'" +
                ", city='" + getCity() + "'" +
                ", state='" + getState() + "'" +
                "}";
    }

}
