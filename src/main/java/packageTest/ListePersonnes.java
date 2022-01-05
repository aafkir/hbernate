package packageTest;
import javax.persistence.*;

import packageTestHibernate.Personne;

import java.util.*;
 
public class ListePersonnes {
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
        Query query = em.createQuery("SELECT p FROM Personne p ORDER BY dateN DESC");
        System.out.println("Les personnes");
        @SuppressWarnings("unchecked")
        List<Personne> personnes = (List<Personne>)query.getResultList();
        for(Personne p : personnes) {
            System.out.println(p+" de la ville "+p.getLocalisation());
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
