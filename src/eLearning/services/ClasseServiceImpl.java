package eLearning.services;

import java.util.List;

import eLearning.dao.Classe;
import eLearning.dao.ClasseDAO;
import eLearning.dao.ClasseDaoImp;
import eLearning.dao.CoursDAO;
import eLearning.dao.CoursDaoImp;

public class ClasseServiceImpl implements ClasseService {
	ClasseDAO dao = new ClasseDaoImp();
	@Override
	public void add(Classe c) {
		dao.add(c);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Classe edit(Classe c) {
			return dao.edit(c);
}

	@Override
	public List<String> findAll() {
		return dao.findAll();
	}

	@Override
	public Classe findById(Long id) {
		return dao.findById(id);

	}

}
