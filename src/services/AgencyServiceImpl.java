package services;

import db.Database;
import exceptions.NotFoundException;
import models.Agency;

import java.util.Set;

public class AgencyServiceImpl implements AgencyService{
    private Database database;

    public AgencyServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String saveAgencies(Agency agency) {
        database.getAgencies().add(agency);
        return "Successfully saved";
    }

    @Override
    public Set<Agency> getAllAgencies() {
        return database.getAgencies();
    }

    @Override
    public Agency getById(long id) {
        for (Agency agency : database.getAgencies()) {
            if (agency.getId() == id){
                return agency;
            }
        }
        throw new NotFoundException("Agency not found with id: "+ id);
    }

    @Override
    public String updateAgency(long id, Agency agency) {
        for (Agency databaseAgency : database.getAgencies()) {
            if (databaseAgency.getId() == id){
                databaseAgency.setName(agency.getName());
                databaseAgency.setAddress(agency.getAddress());
                return "Successfully updated";
            }
        }
        throw new NotFoundException("Agency not found with id: "+ id);
    }

    @Override
    public String deleteAgency(long id) {
        Agency removeAgency = null;
        for (Agency agency: database.getAgencies()){
            if (agency.getId() == id){
                removeAgency = agency;
            }
        }
        database.getAgencies().remove(removeAgency);
        return "Agency deleted";
    }
}
