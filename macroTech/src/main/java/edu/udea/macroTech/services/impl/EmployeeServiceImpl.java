package edu.udea.macroTech.services.impl;


import edu.udea.macroTech.dto.EmployeeDto;
import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    ArrayList<EmployeeDto> response = new ArrayList<EmployeeDto>();


    @Override
    public ArrayList<EmployeeDto> getAll() {

        return response;
    }

    @Override
    public void create(EmployeeDto employee) {
        response.add(employee);
    }

    @Override
    public void update(EmployeeDto employee) {
        int idEmpleado = employee.getIdEmpleado();
        var found = this.response.stream().filter(e -> e.getIdEmpleado() == idEmpleado).findAny();
        if (found.isPresent()) {
            delete(idEmpleado);
            create(employee);
        }

    }

    @Override
    public EmployeeDto getEmployeeByIdEmpleado(int idEmpleado) {

        var found = this.response.stream().filter(e -> e.getIdEmpleado() == idEmpleado).findAny();
        if (found.isPresent()) {
            return found.get();
        }
        return null;
    }

    @Override
    public boolean delete(int idEmpleado) {
        return this.response.removeIf(e -> e.getIdEmpleado() == idEmpleado);
    }
}
