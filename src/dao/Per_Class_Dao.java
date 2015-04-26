package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import per_class.Pessoa_Per_Class;

public class Per_Class_Dao {
    
    private final EntityManagerFactory factory;
    private EntityManager em;
    
    public Per_Class_Dao() {
        factory = Persistence.createEntityManagerFactory("Teste");        
    }

    public void add(Pessoa_Per_Class obj)throws Exception {
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
}
