package mainAPP.service;

import java.util.List;

import mainAPP.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listarProyecto(); // Listar All

	public Proyecto guardarProyecto(Proyecto proyecto); // Guarda un proyecto CREATE

	public Proyecto proyectoXID(Character id); // Leer datos de un proyecto READ

	public Proyecto actualizarProyecto(Proyecto proyecto); // Actualiza datos de un proyecto UPDATE

	public void eliminarProyecto(Character id);// Elimina un proyecto DELETE
}
