package packageTestHibernate;

public class Departement {
	private Integer dep;
	private String nomDep;
	private Lieu chefLieu;
	private String reg;
	
	public Departement() {}
	public Departement(Integer dep, String nomDep, Lieu chefLieu, String reg) {
		this.dep = dep;
		this.nomDep = nomDep;
		this.chefLieu = chefLieu;
		this.reg = reg;
	}
	public Integer getDep() {
		return dep;
	}
	public void setDep(Integer dep) {
		this.dep = dep;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public Lieu getChefLieu() {
		return chefLieu;
	}
	public void setChefLieu(Lieu chefLieu) {
		this.chefLieu = chefLieu;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	@Override
	public String toString() {
		return "Departement [dep=" + dep + ", nomDep=" + nomDep + ", chefLieu=" + chefLieu + ", reg=" + reg + "]";
	}
	
	
	
	
	
	

}
