package edu.udea.macroTech.entities;

import edu.udea.macroTech.entities.Employee;
import edu.udea.macroTech.utils.GenerateUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
@Getter
@Setter
@AllArgsConstructor
public class Transaction {


    public Transaction() {
        this.id = GenerateUUID.createUuid();
    }

    @Id
    @Column(name = "id_transaction")
    private String id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "concept")
    private String concept;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;


}
