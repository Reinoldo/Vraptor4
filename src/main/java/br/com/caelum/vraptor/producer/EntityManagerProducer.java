package br.com.caelum.vraptor.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.util.JPAUtil;

public class EntityManagerProducer {
	
	@Produces
	public EntityManager criaEM(){
		return JPAUtil.criaEntityManager();
	}

}