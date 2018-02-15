package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Formulario;

public class FormularioDao {
	
	private final EntityManager em;

	@Inject
	public FormularioDao(EntityManager em) {
		this.em = em;
	}
	
	public FormularioDao(){
		this(null);
	}
	
	public void adiciona(Formulario formulario) {
		em.getTransaction().begin();
		em.persist(formulario);
		em.getTransaction().commit();
		
	}

	public void remove(Formulario formulario) {
		em.remove(busca(formulario));
	}

	public Formulario busca(Formulario formulario) {
		return em.find(Formulario.class, formulario.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Formulario> lista() {
		return em.createQuery("select f from Formulario f").getResultList();
	}
	
	
	/*@SuppressWarnings("unchecked")
	public List<Formulario> busca2(){
		
		return em.createQuery()
	}*/

}
