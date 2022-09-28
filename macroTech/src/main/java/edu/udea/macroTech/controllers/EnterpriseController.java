package edu.udea.macroTech.controllers;

import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.exceptions.ApiException;
import edu.udea.macroTech.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    //@RequestMapping("index")
    public String index() {

        return "index";
    }

    @GetMapping
    public ResponseEntity<ArrayList<EnterpriseDto>> getAll() {
        return ResponseEntity.ok(enterpriseService.getAll());
    }

    @GetMapping("/{nit}")
    public ResponseEntity<EnterpriseDto> getByNit(@PathVariable int nit) throws ApiException {
        var response = enterpriseService.getEnterpriseByNit(nit);
        if (response != null ) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{nit}")
    public ResponseEntity deleteByNit(@PathVariable int nit) throws ApiException {
        var response = enterpriseService.delete(nit);
        if (response) {
            return ResponseEntity.accepted().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody EnterpriseDto enterprise) throws ApiException {
        enterpriseService.create(enterprise);

    }

    @PatchMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody EnterpriseDto enterprise) throws ApiException {
        enterpriseService.update(enterprise);
    }

}



