package com.bank.internacional.controller;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bank.internacional.model.Persona;
import com.bank.internacional.repository.PersonaRepository;
import com.bank.internacional.service.PersonaService;


@RunWith(MockitoJUnitRunner.class)
public class PersonaControllerTest {
	 
	
	   @Mock
	    private PersonaRepository personaRepository;

	    @InjectMocks
	    private PersonaService personaService;
	    @Test
	    public void testGetPersonaByIdentificacion() throws Exception {
	    	Persona p=new Persona();
	    	p.setApellido("A");
	    	p.setCargo("A");
	    	p.setEdad(1);
	    	p.setIdentificacion("1231231231");
	    	p.setNombre("A");
	    	when(personaService.getPersonaById(1L)).thenReturn(p);

	    	Persona resultado = personaService.getPersonaById(1L);

	        assertEquals(1L, resultado.getId().longValue());
	        assertEquals("Juan", resultado.getNombre());
	    }
}
