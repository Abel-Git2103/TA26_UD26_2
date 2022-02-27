package mainAPP.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proyecto")
public class Proyecto {

	@Id
	private Character id;
	private String nombre;
	private int horas;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado_A> asignado_A;

	// CONSTRUCTORES
	public Proyecto() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 */
	public Proyecto(Character id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	// GETTERS Y SETTERS
	public Character getId() {
		return id;
	}

	public void setId(Character id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}

}
