package com.bank.internacional.model;
import java.util.List;
import jakarta.persistence.*;
/**
 * Entidad de la bdd 
 */

@Entity
@Table(name = "Persona")
public class Persona {
	public Persona() {
		
	};
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "nombres", nullable = false, length = 50)
	private String nombre;
	@Column(name = "apellidos", nullable = false, length = 50)
	 private String apellido;
	@Column(name = "edad")
	 private int edad;
	@Column(name = "tipo")
	 private String tipo;
	@Column(name = "cargo")
	 private String cargo;
	@Column(name = "identificacion")
	 private String identificacion;
	@OneToMany(mappedBy = "persona")
	@MapsId("idPersona")
	private List<Cuenta> cuentas;
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	 
}
