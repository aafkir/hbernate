package packageTest;

import javax.persistence.*;

import packageTestHibernate.Monument;

import java.util.*;
 
public class ListMonument {
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
        Query query = em.createQuery("SELECT p FROM Monument p ");
        System.out.println("Les Monuments");
        @SuppressWarnings("unchecked")
        List<Monument> monuments = (List<Monument>)query.getResultList();
        for(Monument m : monuments) {
            System.out.println(m+" de nom "+m.getNom());
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
