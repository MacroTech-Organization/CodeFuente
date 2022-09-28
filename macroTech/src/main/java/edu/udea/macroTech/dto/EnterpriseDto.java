package edu.udea.macroTech.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class EnterpriseDto {

    private int nit;
    private String name;
    private String addres;
    private String phone;

}
