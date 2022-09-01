package edu.udea.macroTech;

import edu.udea.macroTech.entities.Employee;
import edu.udea.macroTech.entities.Enterprise;
import edu.udea.macroTech.entities.Enum_RoleName;

//@SpringBootApplication
public class MacroTechApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MacroTechApplication.class, args);

		//instanciando la clase Empresa
		Enterprise empresa =new Enterprise(754515555,"oracle","calle 85 no 50-46","3855572");

		System.out.println("nit  de la empresa: "+ empresa.getNit());
		System.out.println("el nombre de la empresa es: "+empresa.getName());
		System.out.println("telefono es: " +empresa.getPhone());
		System.out.println("la direccion de la empresa es: "+empresa.getAddres());

		System.out.println("-----------------------------------");
		//instanciando la clase empleado
		Employee empleado = new Employee("heberto lozano","hebe-j1@hotmail.com", Enum_RoleName.Operario, empresa );
		System.out.println("nombre del empleado: "+empleado.getNameEmployee());
		System.out.println("correo electronico: "+empleado.getEmail());
		System.out.println("rol: "+empleado.getRole());
		System.out.println("nombre de la empresa: "+empresa.getName());

	}//fin del metodo main

}//fin dela clase Main
