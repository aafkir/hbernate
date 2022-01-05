package packageTestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PisteCyclable {
	
	private String codeId;
	private String nomPiste;
	private double longueur;
	private String villeDepart;
	private double longitude;
	private double latitude;
	
	public PisteCyclable() {};
	public PisteCyclable(String codeId, String nomPiste, double longueur, String villeDepart, double longitude,
			double latitude) {
		this.codeId = codeId;
		this.nomPiste = nomPiste;
		this.longueur = longueur;
		this.villeDepart = villeDepart;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	@Id
	@Column
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getNomPiste() {
		return nomPiste;
	}
	public void setNomPiste(String nomPiste) {
		this.nomPiste = nomPiste;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
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
		return "PisteCyclable [codeId=" + codeId + ", nomPiste=" + nomPiste + ", longueur=" + longueur
				+ ", villeDepart=" + villeDepart + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	
	

}
