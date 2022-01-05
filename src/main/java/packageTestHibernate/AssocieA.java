package packageTestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AssocieA {
	private String codeM;
	private Integer numCelebrite;
	
	public AssocieA() {};
	public AssocieA(String codeM, Integer numCelebrite) {
		this.codeM = codeM;
		this.numCelebrite = numCelebrite;
	}

	@Column
	@Id
	public String getCodeM() {
		return codeM;
	}


	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}


	public Integer getNumCelebrite() {
		return numCelebrite;
	}


	public void setNumCelebrite(Integer numCelebrite) {
		this.numCelebrite = numCelebrite;
	}


	@Override
	public String toString() {
		return "AssocieA [codeM=" + codeM + ", numCelebrite=" + numCelebrite + "]";
	}
	
	
	
	

}
