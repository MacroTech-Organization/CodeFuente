package logic;

public class Enterprise {
    //atributos de la clases empresa
    private long Nit;
    private String name;
    private String addres;
    private String phone;

    // metodo constructor
    public Enterprise(long Nit, String name, String addres, String phone) {
        this.Nit= Nit;
        this.name = name;
        this.addres = addres;
        this.phone = phone;
    }
    // getter and setter
    public long getNit() {
        return Nit;
    }

    public void setNit(long Nit) {
        this.Nit = Nit;
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

}//fin de la clase



