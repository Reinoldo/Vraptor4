package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Options {
	
	@GeneratedValue @Id
	private Long id;
	
	@ManyToOne
	
	@JoinColumn(name="question_id")
	private Question question;
	
	private String title;

	
	
	public Options() {
		
	}

	
	public Options(String title, Question question) {
		super();
		
		this.title = title;
		this.question = question;
	}

	public Long getQuestionId(){
		return question.getId();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
