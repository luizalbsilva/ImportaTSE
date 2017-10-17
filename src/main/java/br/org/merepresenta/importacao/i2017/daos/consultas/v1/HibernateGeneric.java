package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.org.merepresenta.importacao.i2017.GenericDao;


@Repository
public class HibernateGeneric<T> implements GenericDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(T entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
}
