package mainAPP.service;

import java.util.List;

import mainAPP.dto.Asignado_A;

public interface IAsignado_AService {

	public List<Asignado_A> listarAsignado_A(); // Listar All

	public Asignado_A guardarAsignado_A(Asignado_A asignado_A); // Guarda asignado_A CREATE

	public Asignado_A asignado_AXID(Integer id); // Leer datos de asignado_A READ

	public Asignado_A actualizarAsignado_A(Asignado_A asignado_A); // Actualiza datos de asignado_A UPDATE

	public void eliminarAsignado_A(Integer id);// Elimina asignado_A DELETE
}
