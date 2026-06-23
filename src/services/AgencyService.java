package services;

import models.Agency;

import java.util.Set;

public interface AgencyService {
    String saveAgencies(Agency agency);
    Set<Agency> getAllAgencies();
    Agency getById(long id);
    String updateAgency(long id, Agency agency);
    String deleteAgency(long id);
}
