package db;

import models.Agency;
import models.Client;
import models.House;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {
    private Set<Agency> agencies;
    private Set<House> houses;
    private List<Client> clients;

    public Database(Set<Agency> agencies, Set<House> houses, List<Client> clients) {
        this.agencies = agencies;
        this.houses = houses;
        this.clients = clients;
    }

    public Set<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(Set<Agency> agencies) {
        this.agencies = agencies;
    }

    public Set<House> getHouses() {
        return houses;
    }

    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
