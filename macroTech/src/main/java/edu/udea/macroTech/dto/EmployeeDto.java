package edu.udea.macroTech.dto;

import edu.udea.macroTech.entities.Enterprise;
import edu.udea.macroTech.entities.Enum_RoleName;

public class EmployeeDto {
    private int idEmpleado;
    private String nameEmployee;
    private String email;
    private String role;
    private int enterprise;

    public EmployeeDto() {
    }

    public EmployeeDto(int idEmpleado,String nameEmployee, String email, String role, int enterprise) {
        this.idEmpleado =idEmpleado;
        this.nameEmployee = nameEmployee;
        this.email = email;
        this.role = role;
        this.enterprise = enterprise;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(int enterprise) {
        this.enterprise = enterprise;
    }
}
