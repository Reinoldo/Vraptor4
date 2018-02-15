package br.com.caelum.vraptor.observers;

import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;


import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.com.caelum.vraptor.model.Formulario;
import br.com.caelum.vraptor.model.Options;
import br.com.caelum.vraptor.model.Question;
import br.com.caelum.vraptor.util.JPAUtil;

public class InitialDataObserver {

	/**
	 * Esse é um exemplo simples de observer do CDI com VRaptor 4
	 * 
	 * Ele é utilizado para inserir um usuário e alguns produtos
	 * sempre que a app é startada, pois estamos usando um banco
	 * em memória. Você pode ler mais a respeito de observers em:
	 *  
	 * http://www.vraptor.org/pt/docs/eventos/
	 */
	public void insert(@Observes VRaptorInitialized event) {
		
		EntityManager em = JPAUtil.criaEntityManager();
		Formulario form1 = new Formulario("Formulario de pesquisa 2", "Reinoldo",20, true, "formulario sobre a população indigena");
		
		
		
		
		
		em.getTransaction().begin();
		
		//em.persist(form1);
		Question q1 = new Question("text","qual seu nome?",1l, form1);
		Question q2 = new Question("text","qual seu nome?",2l, form1);
		
		Options o1 = new Options("solteiro", q1);
		Options o2 = new Options("casado", q1);
		
		//em.persist(q1);
		//em.persist(q2);
		//em.persist(o1);
		em.getTransaction().commit();
		em.close();
	}	
}