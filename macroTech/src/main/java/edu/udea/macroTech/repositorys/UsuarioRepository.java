package edu.udea.macroTech.repositorys;

import edu.udea.macroTech.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByNumeroDocumento(String numeroDocumento);

    Optional<Usuario> findByNumeroDocumentoAndClave(String numeroDocumento, String clave);

}
