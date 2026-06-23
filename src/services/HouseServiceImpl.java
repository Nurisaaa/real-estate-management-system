package services;

import comparators.AreaComparator;
import comparators.PriceComparator;
import db.Database;
import exceptions.NotFoundException;
import models.House;

import java.util.*;

public class HouseServiceImpl implements HouseService{
    private Database database;

    public HouseServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String saveHouse(House house) {
        database.getHouses().add(house);
        return "Saved";
    }

    @Override
    public House getById(long id) {
        for (House house : database.getHouses()) {
            if (house.getId()== id){
                return house;
            }
        }
        throw new NotFoundException("House not found");
    }

    @Override
    public Set<House> getAllHouse() {
        return database.getHouses();
    }

    @Override
    public String updateHouse(House house, long id) {
        for (House house1 : database.getHouses()){
            if (house1.getId() == id){
                house1.setAddress(house.getAddress());
                house1.setPrice(house.getPrice());
                house1.setArea(house.getArea());
                house1.setHouseType(house.getHouseType());
                return "updated";
            }
        }
        throw new NotFoundException("Not found");
    }

    @Override
    public Set<House> sortHouseByPrice(String ascOrDesc) {
        List<House> houses = new ArrayList<>(database.getHouses());
        if (ascOrDesc.equals("asc")){
            houses.sort(new PriceComparator());
            return new LinkedHashSet<>(houses);
        }else if(ascOrDesc.equals("desc")) {
            houses.sort(new PriceComparator().reversed());
            return new LinkedHashSet<>(houses);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Set<House> sortHousesByArea(String ascOrDesc) {
        List<House> houses = new ArrayList<>(database.getHouses());
        if (ascOrDesc.equals("asc")){
            houses.sort(new AreaComparator());
            return new LinkedHashSet<>(houses);
        }else if(ascOrDesc.equals("desc")){
            houses.sort(new AreaComparator().reversed());
            return new LinkedHashSet<>(houses);
        }
        throw new IllegalArgumentException();
    }

}
