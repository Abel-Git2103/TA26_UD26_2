package mainAPP.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientifico")
public class Cientifico {

	@Id
	private String dni;
	private String nomApels;

	@OneToMany(mappedBy = "cientifico", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Asignado_A> asignado_A;

	// CONSTRUCTORES
	public Cientifico() {
	}

	/**
	 * @param dni
	 * @param nomApels
	 */
	public Cientifico(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	// GETTERS Y SETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignado_A() {
		return asignado_A;
	}

	public void setAsignado_A(List<Asignado_A> asignado_A) {
		this.asignado_A = asignado_A;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}

}
