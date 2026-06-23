package models;

public class House{
    private long id;
    private String address;
    private double area;
    private double price;
    private HouseType houseType;

    public House(long id, String address, double area, double price, HouseType houseType) {
        this.id = id;
        this.address = address;
        this.area = area;
        this.price = price;
        this.houseType = houseType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }
}
