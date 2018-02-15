package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Options;

public class OptionsDao {

	
	private final EntityManager em;

	@Inject
	public OptionsDao(EntityManager em) {
		this.em = em;
	}
	
	public OptionsDao() {
		this(null);
	}
	
	public void adiciona(Options options) {
		em.getTransaction().begin();
		em.persist(options);
		em.getTransaction().commit();
	}

	public void remove(Options options) {
		em.remove(busca(options));
	}

	public Options busca(Options options) {
		return em.find(Options.class, options.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Options> lista() {
		return em.createQuery("select p from Options p").getResultList();
	}
}
