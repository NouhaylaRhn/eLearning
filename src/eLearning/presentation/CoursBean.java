package eLearning.presentation;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import eLearning.dao.Classe;
import eLearning.dao.Cours;
import eLearning.services.ClasseService;
import eLearning.services.ClasseServiceImpl;
import eLearning.services.CoursService;
import eLearning.services.CoursServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.*;

@ManagedBean(name="CoursBean1")
@ApplicationScoped
public class CoursBean {
	
	private CoursService coursservice = new CoursServiceImpl();
	private ClasseService classeservice = new ClasseServiceImpl();

	
	
	private String nomcours;
	private String contenu;
	private String catégorie;
	private String succés;
	private static Cours leCours;
	public Cours getLeCours() {
		return leCours;
	}





	public void setLeCours(Cours leCours) {
		this.leCours = leCours;
	}

	private List<String> catégories;
	public List<String> getCatégories() {
		return catégories;
		
	}
	
	private List<Cours> listcours;
	
	
	@PostConstruct
	public void initBean() {
        catégories = new ArrayList<String>();

		List<Classe> listclasse = classeservice.findAll();	
		for(Classe o : listclasse) {
			catégories.add(o.getNom_classe());
		}
		
		listcours = coursservice.findAll();
		
		
		
		
	}
	
	
	
	
	
	public CoursBean() {
        /*catégories = new ArrayList<String>();
		
		catégories.add("Informatique");
		catégories.add("Médecine");
		catégories.add("Littérature"); */
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



	public List<Cours> getListcours() {
		return listcours;
	}



	public void setListcours(List<Cours> listcours) {
		this.listcours = listcours;
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
		coursservice.add(c);
		
		nomcours="";
		contenu="";
		catégorie="";
		
		succés = "le cours est bien ajouté";
		

		
	}
	
	public String fonction() {
		
		System.out.println("here");
		int id;		
		id = Integer.parseInt(FacesContext.getCurrentInstance()
						.getExternalContext().getRequestParameterMap()
						.get("id_cours"));
		leCours = coursservice.findById((long) id);
		return ("ContenuCours.xhtml");
		
	}
	
	
	
	
	

}
