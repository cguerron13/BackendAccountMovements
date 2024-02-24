package com.bank.internacional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.internacional.model.Cuenta;
import com.bank.internacional.model.Movimientos;
import com.bank.internacional.model.Persona;
import com.bank.internacional.repository.PersonaRepository;
@Service
public class PersonaService implements IPersonaService{
	 @Autowired
	    private PersonaRepository personaRepository;
	   /**
	    * Servicio que permite conectar con el repositorio para obtener los datos de la persona por Id
	    */
	    public Persona getPersonaById(Long id) {
	        return personaRepository.findById(id).orElse(null);
	    }
	    
	    /**
	     * Servicio que permite obtener los datos de la persona dado un código de identificación
	     */
	    public Persona getPersonaByIdentificacion(String identificacion) {
	        Persona p= personaRepository.findByIdentificacion(identificacion);
	        return calculoSaldo(p);
	    }
	    /**
	     * Método que nos permite Calcular el saldo del cliente con la operación saldo = C - D (Credito - Debito)
	     * @param persona
	     * @return Objeto persona con el calculo de saldos de cada cuenta
	     */
	    public Persona calculoSaldo(Persona persona) {
	    	double saldo=0;
	    	for(Cuenta cuenta:persona.getCuentas())
	    	{
	    		
	    		for(Movimientos movimiento:cuenta.getCuentaMovimientos())
		    	{
	    		
		    	 if(movimiento.getTipo()=='C')
		    	 {
		    		 saldo=saldo+movimiento.getValor();
		    	 }
		    	 else {
		    		 saldo=saldo-movimiento.getValor();
		    	 }
		    	}
	    		cuenta.setSaldoActual(saldo);
	    		saldo=0;
	    	}
	    	return persona;
	     }
	 }
