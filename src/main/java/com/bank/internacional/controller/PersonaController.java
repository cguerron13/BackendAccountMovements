package com.bank.internacional.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.internacional.model.Persona;
import com.bank.internacional.service.PersonaService;
import com.bank.internacional.util.Utilidades;
@RestController
public class PersonaController {
	   @Autowired
	    private PersonaService personaService;

	   /**
	    * Este servicio permite obtener los datos de la persona por Id
	    * @param id
	    * @return Objeto persona con la información recolectada
	    */
	    @GetMapping("/persona/{id}")
	    public Persona getPersona(@PathVariable Long id) {
	        return personaService.getPersonaById(id);
	    }
	    /**
	     * Servicio que permite obtener los datos de la persona por código del cliente
	     * @param identificacion
	     * @return Objeto persona con las cuentas y sus movimientos
	     */
	    @GetMapping("/informacionPersona/{identificacion}")
	    public Persona getPersonaByIdentificacion(@PathVariable String identificacion) {
	    	if(Utilidades.ValidarCuenta(identificacion)) {
	    		return personaService.getPersonaByIdentificacion(identificacion);	
	    	}
	    	else {
	    		return null;
	    	}
	        
	    }
}
