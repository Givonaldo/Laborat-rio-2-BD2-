package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import single_table.Pessoa_SingleTable;

public class SingleTable_Dao {
    
    private final EntityManagerFactory factory;
    private EntityManager em;
    
    public SingleTable_Dao() {
        factory = Persistence.createEntityManagerFactory("Teste");        
    }

    public void add(Pessoa_SingleTable obj)throws Exception {
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
