package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Proyecto;

public interface IProyectoDao extends JpaRepository<Proyecto, Character> {

}
