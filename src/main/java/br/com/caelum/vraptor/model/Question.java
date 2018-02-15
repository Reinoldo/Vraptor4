package br.com.caelum.vraptor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id @GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy="question", targetEntity=Options.class)
	private List<Options> options;
	
	@ManyToOne
	@JoinColumn(name="formulario")
	private Formulario formulario;
	
	private String type;
	private String title;
	private Long ordem;
	
	public Question(){
		
	}
	
	public Question(String type, String title,Long ordem, Formulario formulario) {
		super();
		
		this.type = type;
		this.title = title;
		this.ordem = ordem;
		this.formulario = formulario;
	}

	public Long getFormId(){
		return formulario.getId();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getOrder() {
		return ordem;
	}

	public void setOrder(Long order) {
		this.ordem = order;
	}
	
	
}
