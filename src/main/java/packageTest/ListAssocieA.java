package packageTest;
import javax.persistence.*;

import packageTestHibernate.AssocieA;

import java.util.*;
public class ListAssocieA {

	 
	
	    public static void main(String[] args) {
	        // Démarre JPA et ouvre une session
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BdPersist");
	        EntityManager em = emf.createEntityManager();
	        System.out.println("Entity manager prêt");
	 
	        // Commence une transaction
	        EntityTransaction tx = em.getTransaction();
	        tx.begin();
	        System.out.println("Début de la transaction");
	 
	        /*
	         * Début du code spécifique
	         */
	        // Requête JPQL
	        
	        //Query est sensible a la casse: la class se nomme AssocieA et non associea
	        Query query = em.createQuery("SELECT a FROM AssocieA a ");
	        System.out.println("les AssocieA");
	        @SuppressWarnings("unchecked")
	        List<AssocieA> personnes = (List<AssocieA>)query.getResultList();
	        for(AssocieA p : personnes) {
	            System.out.println(p.getNumCelebrite()+"----"+ p.getCodeM());
	        }
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
