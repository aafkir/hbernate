package packageTest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import packageTestHibernate.Celebrite;

public class ListCelebrite {
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
        Query query = em.createQuery("SELECT c FROM Celebrite c ");
        System.out.println("Les celebrite");
        @SuppressWarnings("unchecked")
        List<Celebrite> personnes = (List<Celebrite>)query.getResultList();
        for(Celebrite p : personnes) {
            System.out.println(p.getNom());
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
