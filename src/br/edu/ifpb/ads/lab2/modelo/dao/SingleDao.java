package br.edu.ifpb.ads.lab2.modelo.dao;

import javax.persistence.EntityManager;

import br.edu.ifpb.ads.lab2.modelo.entidades.single_table.Pessoa_SingleTable;

public class SingleDao extends Dao<Pessoa_SingleTable> {

	private EntityManager em;

	public SingleDao() {
		this.em = Dao.getEntityManager();
	}

	@Override
	public void add(Pessoa_SingleTable pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(pessoa);
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
	public void remove(long cogido) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_SingleTable p = em.find(Pessoa_SingleTable.class, cogido);
			em.remove(p);
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
	public Pessoa_SingleTable read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Pessoa_SingleTable.class, codigo);
			em.getTransaction().commit();
			return em.find(Pessoa_SingleTable.class, codigo);
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
	public void upDate(Pessoa_SingleTable pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_SingleTable p2 = em.find(Pessoa_SingleTable.class,pessoa.getId());
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

}
