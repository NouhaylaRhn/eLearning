package eLearning.services;

import java.util.List;

import eLearning.dao.Classe;

public interface ClasseService {
	
	public void add(Classe c);
	public void delete(Long id);
	public Classe edit(Classe c);
	public List<String> findAll();
	
	public Classe findById(Long id);

}
