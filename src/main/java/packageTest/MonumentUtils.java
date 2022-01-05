package packageTest;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import packageTestHibernate.Monument;


public class MonumentUtils {
  protected EntityManager em;

  public MonumentUtils(EntityManager em) {
    this.em = em;
  }

  public MonumentUtils() {
	  this(Persistence.createEntityManagerFactory("BdPersist").createEntityManager());
  }

  public Monument createMonument(String geohash, String nom, String proprietaire, String typeM, float longitude, float latitude,String codeInsee) {
	  Monument p = new Monument(geohash,nom, proprietaire,typeM, longitude, latitude,codeInsee);
    em.persist(p);
    return p;
  }

  public void removeMonument(String geohash) {
	  Monument p = findMonument(geohash);
    if (p != null) {
      em.remove(p);
    }
  }

  public Monument findMonument(String geohash) {
    return em.find(Monument.class,geohash);
  }
  
  public Collection<Monument> findAll() {
	    Query query = em.createQuery("SELECT p FROM Monument p");
	   
	    return (Collection<Monument>) query.getResultList();
	  }
  public Collection<Monument> findAll_SameFirstLetter(String name) {
    Query query = em.createQuery("SELECT p FROM Monument p where nom like :name");
    query.setParameter("name", name);
    return (Collection<Monument>) query.getResultList();
  }
  

}
