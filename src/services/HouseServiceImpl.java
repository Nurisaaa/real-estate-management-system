package services;

import db.Database;
import exceptions.NotFoundException;
import models.House;

import java.util.List;
import java.util.Set;

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

}
