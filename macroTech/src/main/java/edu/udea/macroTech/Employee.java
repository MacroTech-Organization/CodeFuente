package edu.udea.macroTech;

public class Employee {
    // atributos de la clase empleado
    private String nameEmployee;
    private String email;
    private Enum_RoleName role;
    private Enterprise enterprise;

    //metodo constructor
    public Employee(String nameEmployee, String email, Enum_RoleName role, Enterprise enterprise) {
        this.nameEmployee = nameEmployee;
        this.email = email;
        this.role = role;
        this.enterprise = enterprise;

    }
    //getter and setter
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

    public Enterprise getEnterprise() { return enterprise; }

    public void setEnterprise(Enterprise enterprise) { this.enterprise = enterprise; }
}//fin de la clases
