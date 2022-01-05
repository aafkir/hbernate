package packageTestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "sitessportsdenature")
public class SiteSportDeNature {

	private String nom;
	private String activite;
	private String codeInsee;
	private double longitude;
	private double latitude;
	
	public SiteSportDeNature() {};
	public SiteSportDeNature(String nom, String activite, String codeInsee, double longitude, double latitude) {
		
		this.nom = nom;
		this.activite = activite;
		this.codeInsee = codeInsee;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	@Id
	@Column
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "SiteSportDeNature [nom=" + nom + ", activite=" + activite + ", codeInsee=" + codeInsee + ", longitude="
				+ longitude + ", latitude=" + latitude + "]";
	}
	
	
	
	
}
