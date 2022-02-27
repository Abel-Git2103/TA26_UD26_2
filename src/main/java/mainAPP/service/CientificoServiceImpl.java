package mainAPP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainAPP.dao.ICientificoDao;
import mainAPP.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService{

	@Autowired
	ICientificoDao iCientificoDao;
	
	@Override
	public List<Cientifico> listarCientifico() {
		return iCientificoDao.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String dni) {
		return iCientificoDao.findById(dni).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		iCientificoDao.deleteById(dni);
	}

}
