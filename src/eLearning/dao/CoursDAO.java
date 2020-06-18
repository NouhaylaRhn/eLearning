package eLearning.dao;

import java.util.List;

import eLearning.dao.Cours;

public interface CoursDAO {
	
	public void add(Cours c);
	public void delete(Long id);
	public Cours edit(Cours c);
	public List<Cours> findAll();
	
	public Cours findById(Long id);
	
	


	

}
