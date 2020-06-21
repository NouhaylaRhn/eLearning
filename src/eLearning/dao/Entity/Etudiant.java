package eLearning.dao.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")

public class Etudiant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="email_etu")
	private String email_etu;
	@Column(name="nom_etu")
	private String nom_etu;
	
	@Column(name="prenom_etu")
	private String prenom_etu;
	
	@Column(name="classe_etu")
	private String class_etu;
	
	@Column(name="id_class")
	private int id_class;
	
	@Column(name="mdp_etu")
	private String mdp_etu;
	

	public String getMdp_etu() {
		return mdp_etu;
	}

	public void setMdp_etu(String mdp_etu) {
		this.mdp_etu = mdp_etu;
	}

	public String getEmail_etu() {
		return email_etu;
	}

	public void setEmail_etu(String email_etu) {
		this.email_etu = email_etu;
	}

	public String getNom_etu() {
		return nom_etu;
	}

	public void setNom_etu(String nom_etu) {
		this.nom_etu = nom_etu;
	}

	public String getPrenom_etu() {
		return prenom_etu;
	}

	public void setPrenom_etu(String prenom_etu) {
		this.prenom_etu = prenom_etu;
	}

	public String getClass_etu() {
		return class_etu;
	}

	public void setClass_etu(String class_etu) {
		this.class_etu = class_etu;
	}

	public int getId_class() {
		return id_class;
	}

	public void setId_class(int id_class) {
		this.id_class = id_class;
	}

	@Override
	public String toString() {
		return "Etudiant [email_etu=" + email_etu + ", nom_etu=" + nom_etu + ", prenom_etu=" + prenom_etu
				+ ", class_etu=" + class_etu + ", id_class=" + id_class + "]";
	}

	public Etudiant(String email_etu, String nom_etu, String prenom_etu, String class_etu, int id_class,String mdp_Etu) {
		super();
		this.email_etu = email_etu;
		this.nom_etu = nom_etu;
		this.prenom_etu = prenom_etu;
		this.class_etu = class_etu;
		this.id_class = id_class;
		this.mdp_etu = mdp_Etu;
	}

	public Etudiant() {
		super();
	}
	
	
	
	
	
	

}
