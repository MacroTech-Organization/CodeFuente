package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.exceptions.ApiException;

import java.util.ArrayList;

public interface EnterpriseService {

    ArrayList<EnterpriseDto> getAll();

    void create(EnterpriseDto enterprise) throws ApiException;

    void update(EnterpriseDto enterprise) throws ApiException;

    EnterpriseDto getEnterpriseByNit(int nit)  throws ApiException;;

    boolean delete(int nit) throws ApiException;


}
