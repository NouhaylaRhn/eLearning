package eLearning.presentation;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import eLearning.dao.Cours;
import eLearning.services.CoursService;
import eLearning.services.CoursServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.*;

@ManagedBean(name="CoursBean1")
@RequestScoped
public class CoursBean {
	
	private CoursService service = new CoursServiceImpl();
	
	
	private String nomcours;
	private String contenu;
	private String catégorie;
	private String succés;
	private List<String> catégories;
	public List<String> getCatégories() {
		return catégories;
		
	}


	
	@PostConstruct
	public void initBean() {
		
	}
	
	
	
	public CoursBean() {
        catégories = new ArrayList<String>();
		
		catégories.add("Informatique");
		catégories.add("Médecine");
		catégories.add("Littérature"); 
	}




	public void setCatégories(List<String> catégories) {
		this.catégories = catégories;
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

	

	public String getNomcours() {
		return nomcours;
	}

	public void setNomcours(String nomcours) {
		this.nomcours = nomcours;
	}
	
	
	
	
	public String getSuccés() {
		return succés;
	}



	public void setSuccés(String succés) {
		this.succés = succés;
	}



	public void addCours(ActionEvent e) {
		
		succés="";
		System.out.println(nomcours);
		System.out.println(contenu);
		System.out.println(catégorie);
		
		Cours c = new Cours();
		c.setNom_cours(nomcours);
		c.setContenu(contenu);
		c.setCatégorie(catégorie);
		service.add(c);
		
		nomcours="";
		contenu="";
		catégorie="";
		
		succés = "le cours est bien ajouté";
		

		
	}
	
	
	
	

}
