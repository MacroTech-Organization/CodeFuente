package edu.udea.macroTech.controllers;

import edu.udea.macroTech.dto.TransactionDto;
import edu.udea.macroTech.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    //@RequestMapping("index")
    public String index() {

        return "index";
    }

    @GetMapping
    public ResponseEntity<ArrayList<TransactionDto>> getAll() {
        return ResponseEntity.ok(transactionService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDto> getById(@PathVariable int id) {
        var response = transactionService.getTransactionById(id);
        if (response != null ) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByNit(@PathVariable int id) {
        var response = transactionService.delete(id);
        if (response) {
            return ResponseEntity.accepted().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody TransactionDto transaction){
        transactionService.create(transaction);

    }

    @PatchMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody TransactionDto transaction){
        transactionService.update(transaction);
    }

}
