package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.EnterpriseDto;

import java.util.ArrayList;

public interface EnterpriseService {

    ArrayList<EnterpriseDto> getAll();

    void create(EnterpriseDto enterprise);

    void update(EnterpriseDto enterprise);

    EnterpriseDto getEnterpriseByNit(int nit);

    boolean delete(int nit);





}
