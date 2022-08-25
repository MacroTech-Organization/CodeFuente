package logic;

public class Employee {
    // atributos de la clase empleado
    private String nameEmployee;
    private String email;
    private Enum_RoleName role;


    //metodo constructor
    public Employee(String nameEmployee, String email, Enum_RoleName role,String  name ) {
        this.nameEmployee = nameEmployee;
        this.email = email;
        this.role = role;


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
}//fin de la clases


