package eLearning.dao.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enseignant")


public class Enseignant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="email_ens")
	private String email_ens;
	
	@Column(name="nom_ens")
	private String nom_ens;
	
	@Column(name="prenom_ens")
	private String prenom_ens;
	
	@Column(name="grade_ens")
	private String grade_ens;

	@Column(name="mdp_ens")
	private String mdp_ens;
	
	
	@Column(name="id_class")
	private int id_class;
	
	@Column(name="id_cours")
	private int id_cours;

	public String getEmail_ens() {
		return email_ens;
	}

	public void setEmail_ens(String email_ens) {
		this.email_ens = email_ens;
	}

	public String getNom_ens() {
		return nom_ens;
	}

	public void setNom_ens(String nom_ens) {
		this.nom_ens = nom_ens;
	}

	public String getPrenom_ens() {
		return prenom_ens;
	}

	public void setPrenom_ens(String prenom_ens) {
		this.prenom_ens = prenom_ens;
	}

	public String getGrade_ens() {
		return grade_ens;
	}

	public void setGrade_ens(String grade_ens) {
		this.grade_ens = grade_ens;
	}

	public int getId_class() {
		return id_class;
	}

	public void setId_class(int id_class) {
		this.id_class = id_class;
	}

	public int getId_cours() {
		return id_cours;
	}

	public void setId_cours(int id_cours) {
		this.id_cours = id_cours;
	}

	@Override
	public String toString() {
		return "Enseignant [email_ens=" + email_ens + ", nom_ens=" + nom_ens + ", prenom_ens=" + prenom_ens
				+ ", grade_ens=" + grade_ens + ", id_class=" + id_class + ", id_cours=" + id_cours + "]";
	}

	public Enseignant() {
		super();
	}

	public Enseignant(String email_ens, String nom_ens, String prenom_ens, String grade_ens, int id_class,
			int id_cours,String mdp_ens) {
		super();
		this.email_ens = email_ens;
		this.nom_ens = nom_ens;
		this.prenom_ens = prenom_ens;
		this.grade_ens = grade_ens;
		this.id_class = id_class;
		this.id_cours = id_cours;
		this.mdp_ens = mdp_ens;
	}

	public String getMdp_ens() {
		return mdp_ens;
	}

	public void setMdp_ens(String mdp_ens) {
		this.mdp_ens = mdp_ens;
	}
		
}
