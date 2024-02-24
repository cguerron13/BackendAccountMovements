package com.bank.internacional.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.internacional.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	 Persona findByIdentificacion(String identificacion);

}
