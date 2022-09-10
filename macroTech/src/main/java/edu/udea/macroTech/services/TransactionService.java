package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.TransactionDto;

import java.util.ArrayList;

public interface TransactionService {
    ArrayList<TransactionDto> getAll();

    void create(TransactionDto transaction);

    void update(TransactionDto transaction);

    TransactionDto getTransactionById(int id);

    boolean delete(int id);


}
