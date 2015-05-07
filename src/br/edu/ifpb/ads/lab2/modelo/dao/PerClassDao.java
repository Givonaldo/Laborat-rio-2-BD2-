package br.edu.ifpb.ads.lab2.modelo.dao;

import javax.persistence.EntityManager;

import br.edu.ifpb.ads.lab2.modelo.entidades.per_class.Pessoa_Per_Class;


public class PerClassDao extends Dao<Pessoa_Per_Class> {

	private EntityManager em;

	public PerClassDao() {
		this.em = Dao.getEntityManager();
	}
	
	@Override
	public void add(Pessoa_Per_Class pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(pessoa);
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
	public void remove(long cogido) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class p = em.find(Pessoa_Per_Class.class, cogido);
			em.remove(p);
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
	public Pessoa_Per_Class read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Pessoa_Per_Class.class, codigo);
			em.getTransaction().commit();
			return em.find(Pessoa_Per_Class.class, codigo);
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
	public void upDate(Pessoa_Per_Class pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class p2 = em.find(Pessoa_Per_Class.class, pessoa.getId());
			p2.setNome(pessoa.getNome());
			p2.setMatricula(pessoa.getMatricula());
			em.merge(p2);
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

}