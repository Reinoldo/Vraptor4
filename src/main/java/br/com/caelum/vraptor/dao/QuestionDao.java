package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Formulario;
import br.com.caelum.vraptor.model.Question;

public class QuestionDao {
	
	private final EntityManager em;

	@Inject
	public QuestionDao(EntityManager em) {
		this.em = em;
	}
	
	public QuestionDao() {
		this(null);
	}
	
	public void adiciona(Question question) {
		em.getTransaction().begin();
		em.persist(question);
		em.getTransaction().commit();
	}

	public void remove(Question question) {
		em.remove(busca(question));
	}

	public Question busca(Question question) {
		return em.find(Question.class, question.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Question> lista(Formulario formulario) {
		return em.createQuery("select p from Question p where formulario = " + formulario.getId()).getResultList();
	}

}
