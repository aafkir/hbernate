package packageTest;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import packageTestHibernate.Personne;
import packageTestHibernate.Ville;

import java.util.Date;

public class PersonneUtils {
  protected EntityManager em;

  public PersonneUtils(EntityManager em) {
    this.em = em;
  }

  public PersonneUtils() {
	  this(Persistence.createEntityManagerFactory("BdPersist").createEntityManager());
  }

  public Personne createPersonne(String numSS, String nom, Date DateN, String genre, Ville localisation) {
	  Personne p = new Personne(numSS,nom,DateN,genre,localisation);
    em.persist(p);
    return p;
  }

  public void removePersonne(String numSS) {
	  Personne p = findPersonne(numSS);
    if (p != null) {
      em.remove(p);
    }
  }

  public Personne findPersonne(String numSS) {
    return em.find(Personne.class, numSS);
  }
  
  public Collection<Personne> findAll() {
	    Query query = em.createQuery("SELECT p FROM Personne p");
	   
	    return (Collection<Personne>) query.getResultList();
	  }
  public Collection<Personne> findAll_SameFirstLetter(String name) {
    Query query = em.createQuery("SELECT p FROM Personne p where nom like :name");
    query.setParameter("name", name);
    return (Collection<Personne>) query.getResultList();
  }
  
  public Collection<Personne> voisins(Ville localisation) {
	    Query query = em.createQuery("SELECT p FROM Personne p where localisation like :localisation");
	    query.setParameter("localisation", localisation);
	    return (Collection<Personne>) query.getResultList();
	  }
}

