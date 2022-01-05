package packageTestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Lieu {
	
	private String codeInsee;
	private String codeDep;
	private double longitude;
	private double latitude;
	private String nomCom;
	
	public Lieu() {}

	public Lieu(String codeInsee, String codeDep, double longitude, double latitude, String nomCom) {
		super();
		this.codeInsee = codeInsee;
		this.codeDep = codeDep;
		this.longitude = longitude;
		this.latitude = latitude;
		this.nomCom = nomCom;
	}

	public String getCodeInsee() {
		return codeInsee;
	}

	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
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
	@Column
    @Id
	public String getNomCom() {
		return nomCom;
	}

	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}

	@Override
	public String toString() {
		return "Lieu [codeInsee=" + codeInsee + ", codeDep=" + codeDep + ", longitude=" + longitude + ", latitude="
				+ latitude + ", nomCom=" + nomCom + "]";
	}



	

	
	
	

}
