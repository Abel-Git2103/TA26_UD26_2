package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Cientifico;

public interface ICientificoDao extends JpaRepository<Cientifico, String> {

}
