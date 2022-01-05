package packageTest;
import javax.persistence.*;

import packageTestHibernate.Role;
import packageTestHibernate.User;

import java.util.*;
 
public class ListeVilles {
    public static void main(String[] args) {
        // Démarre JPA et ouvre une session
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BdPersist");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity manager prêt");
 
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        System.out.println("Début de la transaction");
        /*
        PersonneUtils pu = new PersonneUtils(em);
     
        Query query = em.createQuery("SELECT v FROM Ville v ");
        System.out.println("Les villes");
        @SuppressWarnings("unchecked")
        List<Ville> villes = (List<Ville>)query.getResultList();
        for(Ville vil : villes) {
            System.out.println(vil.getNom());
            Collection<Personne> c2 = pu.voisins(vil);
	        for (Personne p : c2)
	        { System.out.println(p.toString());}
            
        }
        */
        tx.commit();
        User user = em.find(User.class, 3);
        System.out.println("Role de user3 ");
        for(Role ass: user.getRoles()) {
        	System.out.println( ass);
        }
        System.out.println("------------ "); 
           
        Role role = em.find(Role.class,1 );
        System.out.println("utilisateur touriste ");
        for(User aa: role.getUsers()) {
        	System.out.println(aa);
        }
        System.out.println("Transaction confirmée");
 
       
        em.close();
        emf.close();
    }
}
