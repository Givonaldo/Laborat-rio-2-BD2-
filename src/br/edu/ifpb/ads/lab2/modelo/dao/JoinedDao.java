package br.edu.ifpb.ads.lab2.modelo.dao;

import javax.persistence.EntityManager;

import br.edu.ifpb.ads.lab2.modelo.entidades.joined.Pessoa_Joined;

public class JoinedDao extends Dao<Pessoa_Joined> {

	private EntityManager em;

	public JoinedDao() {
		this.em = Dao.getEntityManager();
	}
	
	@Override
	public void add(Pessoa_Joined pessoa) throws Exception {
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
			Pessoa_Joined p = em.find(Pessoa_Joined.class, cogido);
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
	public Pessoa_Joined read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Pessoa_Joined.class, codigo);
			Pessoa_Joined p = em.find(Pessoa_Joined.class, codigo);
			em.getTransaction().commit();
			return p;
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
	public void upDate(Pessoa_Joined pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Joined p2 = em.find(Pessoa_Joined.class, pessoa.getId());
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
