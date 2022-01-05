package packageTestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Celebrite {
	private Integer numCelebrite;
	private String nom;
	private String prenom;
	private String nationalite;
	private String epoque;
	  
	
	public Celebrite() {}
	
	
	public Celebrite(Integer numCelebrite, String nom, String prenom, String nationalite, String epoque) {
		this.numCelebrite = numCelebrite;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	}
	@Column
	@Id
	public Integer getNumCelebrite() {
		return numCelebrite;
	}


	public void setNumCelebrite(Integer numCelebrite) {
		this.numCelebrite = numCelebrite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getEpoque() {
		return epoque;
	}


	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}


	@Override
	public String toString() {
		return "Celebrite [numCelebrite=" + numCelebrite + ", nom=" + nom + ", prenom=" + prenom + ", nationalite="
				+ nationalite + ", epoque=" + epoque + "]";
	}
	
	
	
	

}
