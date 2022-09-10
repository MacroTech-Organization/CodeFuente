package edu.udea.macroTech.dto;

import edu.udea.macroTech.entities.Enterprise;
import edu.udea.macroTech.entities.Enum_RoleName;

public class EmployeeDto {
    private int idEmpleado;
    private String nameEmployee;
    private String email;
    private Enum_RoleName role;
    private Enterprise enterprise;

    public EmployeeDto() {
    }

    public EmployeeDto(int idEmpleado,String nameEmployee, String email, Enum_RoleName role, Enterprise enterprise) {
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

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
