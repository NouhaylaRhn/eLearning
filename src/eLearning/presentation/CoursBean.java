package eLearning.presentation;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.*;

@ManagedBean
@RequestScoped
public class CoursBean {
	
	private String nomcours;
	
	
	public void initBean() {
		
	}

	public String getNomcours() {
		return nomcours;
	}

	public void setNomcours(String nomcours) {
		this.nomcours = nomcours;
	}
	
	
	
	
	

}
