package mainAPP.service;

import java.util.List;

import mainAPP.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listarCientifico(); //Listar All 
	
	public Cientifico guardarCientifico(Cientifico cientifico);	//Guarda un cientifico CREATE
	
	public Cientifico cientificoXID(String id); //Leer datos de un cientifico READ
		
	public Cientifico actualizarCientifico(Cientifico cientifico); //Actualiza datos de un cientifico UPDATE
	
	public void eliminarCientifico(String id);// Elimina un cientifico DELETE
}
