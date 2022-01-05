package packageTest;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import packageTestHibernate.Ville;


public class ListVille {
	
	  protected EntityManager em;

	  public ListVille() {
		  this(Persistence.createEntityManagerFactory("BdPersist").createEntityManager());
	  }
	  public ListVille(EntityManager createEntityManager) {
		  this.em = em;
	}

	public Collection<Ville> findAll() {
		    Query query = em.createQuery("SELECT v FROM Ville v ");
		    
		    return (Collection<Ville>) query.getResultList();
		  }

}
