package edu.udea.macroTech.services.impl;

import edu.udea.macroTech.dto.EnterpriseDto;
import edu.udea.macroTech.entities.Enterprise;
import edu.udea.macroTech.exceptions.ApiException;
import edu.udea.macroTech.exceptions.ErrorRq;
import edu.udea.macroTech.repositorys.EnterpriseRepository;
import edu.udea.macroTech.services.EnterpriseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Slf4j
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

   @Autowired
   private EnterpriseRepository enterpriseRepository;



    @Override
    public ArrayList<EnterpriseDto> getAll() {

        return enterpriseRepository.findAll().stream().map(
                e -> EnterpriseDto.builder()
                        .nit(e.getNit())
                        .name(e.getName())
                        .addres(e.getAddres())
                        .phone(e.getPhone())
                        .build()
        ).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void create(EnterpriseDto enterprise) throws ApiException {

        var enterpriseOptional = enterpriseRepository.findByNit(enterprise.getNit());
        if (enterpriseOptional.isPresent()){
            throw  new ApiException(ErrorRq.getErrorRq(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    "Ya existe una empresa con este nit",
                    HttpStatus.BAD_REQUEST.value()));
        }

        Enterprise e = new Enterprise();
        e.setAddres(enterprise.getAddres());
        e.setName(enterprise.getName());
        e.setNit(enterprise.getNit());
        e.setPhone(enterprise.getPhone());

        enterpriseRepository.save(e);
    }

    @Override
    public void update(EnterpriseDto enterprise) throws ApiException {

        var e = enterpriseRepository.findByNit(enterprise.getNit()).orElseThrow(
                () ->  new ApiException(ErrorRq.getErrorRq(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        "Empresa no existe",
                        HttpStatus.BAD_REQUEST.value()))
        );

        e.setPhone(enterprise.getPhone());
        e.setName(enterprise.getName());
        e.setAddres(enterprise.getAddres());

        enterpriseRepository.save(e);

    }

    @Override
    public EnterpriseDto getEnterpriseByNit(int nit)  throws ApiException{

        var e = enterpriseRepository.findByNit(nit).orElseThrow(
                () ->  new ApiException(ErrorRq.getErrorRq(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        "Empresa no existe",
                        HttpStatus.BAD_REQUEST.value()))
        );

        return EnterpriseDto.builder()
                .nit(e.getNit())
                .name(e.getName())
                .addres(e.getAddres())
                .phone(e.getPhone())
                .build();

    }

    @Override
    public boolean delete(int nit) throws ApiException {

        var e = enterpriseRepository.findByNit(nit).orElseThrow(
                () ->  new ApiException(ErrorRq.getErrorRq(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        "Empresa no existe",
                        HttpStatus.BAD_REQUEST.value()))
        );

        try {
            enterpriseRepository.delete(e);
            return true;
        } catch ( Exception ex) {
            log.error("Ocurrio un error {}",ex.getMessage());
            return false;
        }

    }
}
