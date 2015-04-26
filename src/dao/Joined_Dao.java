package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import joined_entidades.Pessoa_Joined;

public class Joined_Dao {
    
    private final EntityManagerFactory factory;
    private EntityManager em;
    
    public Joined_Dao() {
        factory = Persistence.createEntityManagerFactory("Teste");        
    }

    public void add(Pessoa_Joined obj)throws Exception {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            //throw new Exception();
        } finally {
            em.close();
            factory.close();
        }
    }
    
    
    
    
    // Médotos abaixo ainda errados
    
    
    public void remove(Pessoa_Joined obj) throws Exception{ 
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            em.close();
            factory.close();
        }
    }
    
    public void update(Pessoa_Joined obj) throws Exception {
        em = factory.createEntityManager();
        try {
           em.getTransaction().begin();
           Pessoa_Joined p2 = em.find(Pessoa_Joined.class, obj.getId());
           em.merge(p2);
           em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            em.close();
            factory.close();
        }
    }
}