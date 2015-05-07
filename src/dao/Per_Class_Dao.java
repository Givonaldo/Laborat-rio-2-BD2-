package dao;

import javax.persistence.EntityManager;

import per_class.Pessoa_Per_Class;

public class Per_Class_Dao extends Dao<Pessoa_Per_Class> {
    
    private EntityManager em;
    
    public Per_Class_Dao() {
        em = Dao.getEntityManager();      
    }
    
    @Override
    public void add(Pessoa_Per_Class obj)throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            if(em.isOpen()){
            	em.getTransaction().rollback();
            }
        	throw new Exception();
        } finally {
            if(em.isOpen()){
            	em.close();            	
            }
        }
    }

	@Override
	public void remove(long pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			em.remove(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void update(Pessoa_Per_Class pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class p2 = em.find(Pessoa_Per_Class.class, pessoa.getId());
			p2.setNome(pessoa.getNome());
			p2.setMatricula(pessoa.getMatricula());
			em.merge(p2);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Pessoa_Per_Class read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class p2 = em.find(Pessoa_Per_Class.class, codigo);
			em.merge(p2);
			em.getTransaction().commit();
			return p2;
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}
}
