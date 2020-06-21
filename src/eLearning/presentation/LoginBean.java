package eLearning.presentation;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import eLearning.dao.*;
import eLearning.dao.Entity.Enseignant;
import eLearning.dao.Entity.Etudiant;

@SuppressWarnings("deprecation")
@ManagedBean(name="loginBean")
@javax.faces.bean.SessionScoped
public class LoginBean implements Serializable {


   private static final long serialVersionUID = -5433850275008415405L;
   private EtudiantDAO etudiantDAO = new EtudiantDaoImp();
   private EnseignantDAO enseignantDAO = new EnseignantDaoImp();
   private String email;
   private String password;
 
   public String getEmail() {
	   return email;
   }
   public void setemail(String email) {
	   this.email = email;
   }
   public String getPassword() {
	   return password;
   }
   public void setPassword(String password) {
	   this.password = password;
   }
   
   public String checkuser() {
	   
	   etudiantDAO = new EtudiantDaoImp();
	   enseignantDAO = new EnseignantDaoImp();
	   boolean validLogin=false;
	   String Rang="No";
	   try {
		System.out.println("jrebt");
       	List<Etudiant> etudiants = etudiantDAO.GetEtudiants();
       	System.out.println(etudiants);
       	for(Etudiant usr : etudiants) {
				if(usr.getEmail_etu().equals(email) && usr.getMdp_etu().equals(password)) { 
					Rang = "Etudiant";
					validLogin=true;
				}
       	}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	   try {
	       	List<Enseignant> Enseignants = enseignantDAO.GetEnseignants();
	       	for(Enseignant usr : Enseignants) {
					if(usr.getEmail_ens().equals(email) && usr.getMdp_ens().equals(password)) { 
						Rang = "Enseignant";
						validLogin=true;
					}
	       	}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	   System.out.println(Rang);
	   return Rang;
   }
   
   
   
   
   
   
   
}