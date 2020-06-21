package eLearning.dao;

import java.util.List;

import eLearning.dao.Entity.Enseignant;


public interface EnseignantDAO {

	public List<Enseignant> GetEnseignants() throws Exception;
	
}
