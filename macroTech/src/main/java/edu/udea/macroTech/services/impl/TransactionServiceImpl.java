package edu.udea.macroTech.services.impl;

import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.dto.TransactionDto;
import edu.udea.macroTech.services.TransactionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TransactionServiceImpl implements TransactionService {


    ArrayList<TransactionDto> response = new ArrayList<TransactionDto>();


    @Override
    public ArrayList<TransactionDto> getAll() {

        return response;
    }

    @Override
    public void create(TransactionDto transaction) {
        response.add(transaction);
    }

    @Override
    public void update(TransactionDto transaction) {
        int id = transaction.getId();
        var found = this.response.stream().filter(e -> e.getId() == id).findAny();
        if (found.isPresent()) {
            delete(id);
            create(transaction);
        }

    }

    @Override
    public TransactionDto getTransactionById(int id) {

        var found = this.response.stream().filter(e -> e.getId() == id).findAny();
        if (found.isPresent()) {
            return found.get();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        return this.response.removeIf(e -> e.getId() == id);
    }
}
