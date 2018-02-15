package br.com.caelum.vraptor.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formulario {
	
	@GeneratedValue @Id
	private Long id;
	
	@OneToMany(mappedBy="formulario", targetEntity=Question.class)
	private List<Question> question;
	
	private String title;
	private String author;
	//private Date initial_data;W
	//private Date final_date;
	private int qnt_recept;
	private boolean status;
	private String description;

	
	
	public Formulario() {
		
	}

	
	public Formulario(String title, String author, int qnt_recept,
			boolean status, String description) {
		
		
		this.title = title;
		this.author = author;		
		this.qnt_recept = qnt_recept;
		this.status = status;
		this.description = description;
		//this.question = new ArrayList<Question>(); 
	}

/*	public void addQuastion(Question q){
			
		this.question.add(q);
	
	}*/
	

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public List<Question> getQuestions(){
		return this.question;
	}

	/**
	 * @return
	 
	public Date getInitial_data() {
		return initial_data;
	}

	public void setInitial_data(Date initial_data) {
		this.initial_data = initial_data;
	}

	public Date getFinal_date() {
		return final_date;
	}

	public void setFinal_date(Date final_date) {
		this.final_date = final_date;
	}*/

	public int getQnt_recept() {
		return qnt_recept;
	}

	public void setQnt_recept(int qnt_recept) {
		this.qnt_recept = qnt_recept;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
