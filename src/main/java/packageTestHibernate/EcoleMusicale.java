package packageTestHibernate;

import javax.persistence.*;

@Entity
public class EcoleMusicale {
	private String nomEcole;
	private String codeInsee;
	private double longitude;
	private double latitude;
	
	public EcoleMusicale() {};
	
	public EcoleMusicale(String nomEcole, String codeInsee, double longitude, double latitude) {
		
		this.nomEcole = nomEcole;
		this.codeInsee = codeInsee;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	
	//On peut  avoir un @Id que suur un seul attribut. 
	//Cette annotations permet de referencer pour par exemple:
		//		  public EcoleMusicale findEcole(String nomEcole) {
	    //	return em.find(EcoleMusicale.class,nomEcole);
	@Id
	@Column(updatable=true)
	public String getNomEcole() {
		return nomEcole;
	}
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
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
		return "EcoleMusicale [nomEcole=" + nomEcole + ", codePostal=" + codeInsee + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}

	
	



	





}

