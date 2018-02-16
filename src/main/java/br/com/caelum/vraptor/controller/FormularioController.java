package br.com.caelum.vraptor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.catalina.connector.Request;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.FormularioDao;
import br.com.caelum.vraptor.dao.OptionsDao;
import br.com.caelum.vraptor.dao.QuestionDao;
import br.com.caelum.vraptor.model.Formulario;
import br.com.caelum.vraptor.model.Question;


@Controller
public class FormularioController {

	private final Result result;
	private final FormularioDao dao;
	private OptionsDao daoO;
	private QuestionDao daoQuestion;
	private Formulario form;
	
	@Inject
	public FormularioController(Result result,FormularioDao dao, OptionsDao daoO, QuestionDao daoQuestion) {
		
		this.dao = dao;
		this.result = result;
		this.daoO = daoO;
		this.daoQuestion = daoQuestion;
	}
	
	public FormularioController(){
		this(null, null, null, null);
	}

	@Get
	public void lista(){
		
		result.include("formularioList", dao.lista());
		
		
		
		
	}
	
	

	@Get
	public void visualiza(Formulario formulario){
		
		System.out.println("teste " + formulario.getId());
		result.include("questionList", daoQuestion.lista(formulario));
		result.include("optionsList",daoO.lista());
	}
	
	
	
	
}
