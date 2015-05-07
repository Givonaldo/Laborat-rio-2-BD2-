package dao;

import javax.persistence.EntityManager;

import single_table.Pessoa_SingleTable;

public class SingleTable_Dao extends Dao<Pessoa_SingleTable> {

	private EntityManager em;

	public SingleTable_Dao() {
		em = Dao.getEntityManager();
	}

	@Override
	public void add(Pessoa_SingleTable obj) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(obj);
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
	public void update(Pessoa_SingleTable pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_SingleTable p2 = em.find(Pessoa_SingleTable.class,
					pessoa.getId());
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
	public Pessoa_SingleTable read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_SingleTable p2 = em.find(Pessoa_SingleTable.class, codigo);
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
