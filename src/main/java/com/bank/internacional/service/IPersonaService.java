package com.bank.internacional.service;

import com.bank.internacional.model.Persona;

public interface IPersonaService {
	/**
	 * Servicio que permite conectar con el repositorio para obtener los datos de la
	 * persona por Id
	 */
	Persona getPersonaById(Long id);
	/**
     * Método que nos permite Calcular el saldo del cliente con la operación saldo = C - D (Credito - Debito)
     * @param persona
     * @return Objeto persona con el calculo de saldos de cada cuenta
     */
	Persona getPersonaByIdentificacion(String identificacion);
}
