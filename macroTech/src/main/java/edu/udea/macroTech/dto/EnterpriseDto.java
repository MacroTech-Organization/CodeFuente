package edu.udea.macroTech.dto;



public class EnterpriseDto {

    private int nit;
    private String name;
    private String addres;
    private String phone;



    public EnterpriseDto() {

    }

    public EnterpriseDto(int nit, String name, String addres, String phone) {
        this.nit = nit;
        this.name = name;
        this.addres = addres;
        this.phone = phone;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
