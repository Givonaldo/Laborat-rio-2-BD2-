package dao;

import javax.persistence.EntityManager;

import joined.Pessoa_Joined;

public class Joined_Dao extends Dao<Pessoa_Joined> {

	private EntityManager em;

	public Joined_Dao() {
		this.em = Dao.getEntityManager();
	}

	@Override
	public void add(Pessoa_Joined pessoa) throws Exception {
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
	public void update(Pessoa_Joined pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Joined p2 = em.find(Pessoa_Joined.class, pessoa.getId());
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
	public Pessoa_Joined read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Joined p2 = em.find(Pessoa_Joined.class, codigo);
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