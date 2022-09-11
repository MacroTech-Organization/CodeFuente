package edu.udea.macroTech.controllers;


import edu.udea.macroTech.dto.EmployeeDto;
import edu.udea.macroTech.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //@RequestMapping("index")
    public String index() {

        return "index";

    }

    @GetMapping
    public ResponseEntity<ArrayList<EmployeeDto>> getAll() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{idEmpleado}")
    public ResponseEntity<EmployeeDto> getByNit(@PathVariable int idEmpleado) {
        var response = employeeService.getEmployeeByIdEmpleado(idEmpleado);
        if (response != null ) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{idEmpleado}")
    public ResponseEntity deleteByNit(@PathVariable int idEmpleado) {
        var response = employeeService.delete(idEmpleado);
        if (response) {
            return ResponseEntity.accepted().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody EmployeeDto employee){
        employeeService.create(employee);

    }

    @PatchMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody EmployeeDto employee){
        employeeService.update(employee);
    }

}
