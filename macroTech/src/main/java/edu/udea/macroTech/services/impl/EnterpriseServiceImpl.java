package edu.udea.macroTech.services.impl;

import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.services.EnterpriseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    ArrayList<EnterpriseDto> response = new ArrayList<EnterpriseDto>();


    @Override
    public ArrayList<EnterpriseDto> getAll() {

        return response;
    }

    @Override
    public void create(EnterpriseDto enterprise) {
        response.add(enterprise);
    }

    @Override
    public void update(EnterpriseDto enterprise) {
        int nit = enterprise.getNit();
        var found = this.response.stream().filter(e -> e.getNit() == nit).findAny();
        if (found.isPresent()) {
            delete(nit);
            create(enterprise);
        }

    }

    @Override
    public EnterpriseDto getEnterpriseByNit(int nit) {

        var found = this.response.stream().filter(e -> e.getNit() == nit).findAny();
        if (found.isPresent()) {
            return found.get();
        }
        return null;
    }

    @Override
    public boolean delete(int nit) {
        return this.response.removeIf(e -> e.getNit() == nit);
    }
}
