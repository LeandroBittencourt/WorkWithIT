package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="frase", sequenceName="SEQ_FRASE", allocationSize=1)
public class Frase {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="frase")
	private int id;
	private String frase;
	private String autor;
	
	public Frase() {
		super();
		
	}
	
	public Frase(String frase, String autor) {
		super();
		this.frase=frase;
		this.autor = autor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
