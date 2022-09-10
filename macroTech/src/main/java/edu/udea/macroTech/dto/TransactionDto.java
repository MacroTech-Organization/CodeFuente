package edu.udea.macroTech.dto;

import edu.udea.macroTech.entities.Employee;

public class TransactionDto {


    public TransactionDto(){

    }

    private  int id;
    private  float amount;
    private String concept;
    private Employee nameUserMov;

    // Constuctor de la clase Transaction
    public TransactionDto(int id, float amount, String concept, Employee nameUserMov){
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.nameUserMov = nameUserMov;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Employee getNameUserMov() {
        return nameUserMov;
    }

    public void setNameUserMov(Employee nameUserMov) {
        this.nameUserMov = nameUserMov;
    }
}
