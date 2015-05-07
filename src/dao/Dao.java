package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Dao<T> {
	
	private static EntityManagerFactory factory;
    
    public Dao() {
        factory = Persistence.createEntityManagerFactory("Teste");        
    }
    
    public static EntityManager getEntityManager(){
    	return  factory.createEntityManager(); 
    }

    public abstract void add(T pessoa) throws Exception;
    
    public abstract void remove(long codigo)throws Exception;
    
    public abstract void update(T pessoa)throws Exception;
    
    public abstract T read(long codigo)throws Exception;
}