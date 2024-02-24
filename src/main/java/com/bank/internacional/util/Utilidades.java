package com.bank.internacional.util;

public class Utilidades {
	
	/**
	 * Variable para devolver el código del error configurado
	 */
	public static final String codigoError="001";
	/**
	 * Variable para devolver el mensaje del error 001
	 */
	public static final String mensaje="El tamaño del texto no cumple el requerido de 9 caracteres";
	/**
	 * Método que nos permite validar si la cuenta tiene el número de caracteres indicado
	 * @param numeroCuenta
	 * @return True si cumple con la regla o false si no cumple con el tamaño =9
	 */
	public static boolean ValidarCuenta(String numeroCuenta) {
		if(null!=numeroCuenta && numeroCuenta.length()==9) {
			return true;
		}
		else {
			return false;
		}
	}

}
