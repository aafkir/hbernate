package packageTestHibernate;

import javax.persistence.*;
@Entity
public class Monument {
	private String geohash;
	private String nom;
	private String proprietaire;
	private String typeM;
	private double longitude;
	private double latitude;
	private String codeInsee;
	
	
	public Monument() {}


	public Monument(String geohash, String nom, String proprietaire, String typeM, double longitude, double latitude,
			String codeInsee) {
	
		this.geohash = geohash;
		this.nom = nom;
		this.proprietaire = proprietaire;
		this.typeM = typeM;
		this.longitude = longitude;
		this.latitude = latitude;
		this.codeInsee = codeInsee;
	}
//On peut  avoir un @Id que suur un seul attribut. 
//Cette annotations permet de referencer pour par exemple:
	//		  public Monument findMonument(String geohash) {
    //				return em.find(Monument.class,geohash);
  
	@Id
	public String getGeohash() {
		return geohash;
	}


	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}
	
    @Column(updatable=true)
    public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}


	public String getTypeM() {
		return typeM;
	}


	public void setTypeM(String typeM) {
		this.typeM = typeM;
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


	public String getCodeInsee() {
		return codeInsee;
	}


	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}


	@Override
	public String toString() {
		return "Monument "+"\r\n"+"[geohash=" + geohash + ", nom=" + nom + ", proprietaire=" + proprietaire + ", typeM=" + typeM
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", codeInsee=" + codeInsee + "]";
	}
	





}
