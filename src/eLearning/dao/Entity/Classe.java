package eLearning.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classe")


public class Classe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_class")
	private int id;
	
	
	
	@Column(name="nom_class")
	private String nom_classe ;
	
	
	
	
	public Classe( String nom_classe) {
		super();
		this.nom_classe = nom_classe;
	}

	
	



	public Classe() {
		super();
	}






	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	


	public String getNom_classe() {
		return nom_classe;
	}



	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}






	@Override
	public String toString() {
		return "Classe [id=" + id + ", nom_classe=" + nom_classe + "]";
	}
	
	
	

}
