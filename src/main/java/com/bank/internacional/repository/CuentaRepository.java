package com.bank.internacional.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bank.internacional.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long>  {
	@Query("SELECT c FROM Cuenta c WHERE c.persona.id = :idPersona")
   List<Cuenta> findByIdPersona(@Param("idPersona") Long idPersona);

}
