package eLearning.dao;

import java.util.List;

import eLearning.dao.Cours;

public interface ClasseDAO {
	
	public void add(Classe c);
	public void delete(Long id);
	public Classe edit(Classe c);
	public List<Classe> findAll();
	
	public Classe findById(Long id);
	
	


	

}
