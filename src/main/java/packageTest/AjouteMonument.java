package packageTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import packageTestHibernate.Monument;

public class AjouteMonument {
	    public static void main(String[] args) {
	        // Démarre JPA et ouvre une session
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BdPersist");
	        EntityManager em = emf.createEntityManager();
	        System.out.println("Entity manager prêt");
	 
	        // Commence une transaction
	        EntityTransaction tx = em.getTransaction();
	        tx.begin();
	        System.out.println("Début de la transaction Ajoute Monument");

	       
	        
	            Monument m = new Monument("spfb05ty554b","HOTEL DUFFAU","PRIVE"
	            		,"HOTEL_PARTICULIER",3.3432,4.3612
	            		,"34000");
	            System.out.println(m.toString() + " created");
	            
	            //creation d'une relation de lieu et Departement
	           
	            
	           
	            //creation d'une relation 
	 
	            // Rend celui-ci persistent dans la base de données
	          //  em.persist(v);
	            em.persist(m);
	           
	        /*
	         * Fin du code spécifique
	         */
	 
	        // Applique les modifications à la base de données
	        tx.commit();
	        System.out.println("Transaction confirmée");
	 
	        // Ferme la session et termine JPA
	        em.close();
	        emf.close();
	    }
	

}
