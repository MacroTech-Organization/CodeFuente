package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.EmployeeDto;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<EmployeeDto> getAll();

    void create(EmployeeDto employee);

    void update(EmployeeDto employee);

    EmployeeDto getEmployeeByIdEmpleado(int idEmpleado);

    boolean delete(int idEmpleado);

}
