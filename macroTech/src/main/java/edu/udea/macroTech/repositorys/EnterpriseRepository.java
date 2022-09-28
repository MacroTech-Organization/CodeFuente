package edu.udea.macroTech.repositorys;

import edu.udea.macroTech.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, String> {

   Optional<Enterprise> findByNit(int nit);

}
