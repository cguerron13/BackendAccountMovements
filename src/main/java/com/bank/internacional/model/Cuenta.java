package com.bank.internacional.model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Entidad de la bdd 
 */
@Entity
@Table(name = "Cuenta")
public class Cuenta {
	public Cuenta() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "numeroCuenta")
	private String numeroCuenta;
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	@Column(name = "saldoActual")
	private double saldoActual;
	@ManyToOne
	@JoinColumn(name = "idPersona")
	@JsonIgnore
	private Persona persona;
	
	@OneToMany(mappedBy = "cuenta")
	@MapsId("idCuenta")
	private List<Movimientos> cuentaMovimientos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Movimientos> getCuentaMovimientos() {
		return cuentaMovimientos;
	}

	public void setCuentaMovimientos(List<Movimientos> cuentaMovimientos) {
		this.cuentaMovimientos = cuentaMovimientos;
	}

}
