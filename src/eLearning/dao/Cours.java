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
	private Long id;
	
	@Column(name="nom_cours")
	private String nom_cours ;
	
	@Column(name="catégorie")
	private String catégorie;
	
	@Column(name="Contenu")
	private String contenu;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_cours() {
		return nom_cours;
	}

	public void setNom_cours(String nom_cours) {
		this.nom_cours = nom_cours;
	}
	
	
	
	

	public String getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Cours(String nom_cours) {
		super();
		this.nom_cours = nom_cours;
	}

	public Cours() {
		super();
	}
	
	
	

}
