package services;

import models.House;

import java.util.List;
import java.util.Set;

public interface HouseService {
    String saveHouse(House house);
    House getById(long id);
    Set<House> getAllHouse();
    String updateHouse(House house, long id);
    Set<House> sortHouseByPrice(String ascOrDesc);
    Set<House> sortHousesByArea(String ascOrDesc);

}
