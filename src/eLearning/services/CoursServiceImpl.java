package eLearning.services;

import java.util.List;

import eLearning.dao.Cours;
import eLearning.dao.CoursDAO;
import eLearning.dao.CoursDaoImp;

public class CoursServiceImpl implements CoursService {
	
	CoursDAO dao = new CoursDaoImp();
	

	@Override
	public void add(Cours c) {
		dao.add(c);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Cours edit(Cours c) {
		return dao.edit(c);
	}

	@Override
	public List<Cours> findAll() {
		return dao.findAll();
	}

	@Override
	public Cours findById(Long id) {
		return dao.findById(id);
	}

}
