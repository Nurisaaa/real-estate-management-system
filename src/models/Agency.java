package models;

import java.util.List;

public class Agency {
    private long id;
    private String name;
    private String address;
    private List<House> houses;
    private List<Client> clients;

    public Agency(long id, String name, String address, List<House> houses, List<Client> clients) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.houses = houses;
        this.clients = clients;
    }

    public Agency(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
