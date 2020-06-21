package eLearning.dao;

import java.util.List;

import eLearning.dao.Entity.Etudiant;

public interface EtudiantDAO {

	public List<Etudiant> GetEtudiants() throws Exception;
	
	
}
