package eLearning.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cours")
public class Cours implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cours")
	private int id;
	
	@Column(name="nom_cours")
	private String nom_cours ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_cours() {
		return nom_cours;
	}

	public void setNom_cours(String nom_cours) {
		this.nom_cours = nom_cours;
	}

	public Cours(String nom_cours) {
		super();
		this.nom_cours = nom_cours;
	}

	public Cours() {
		super();
	}
	
	
	

}
