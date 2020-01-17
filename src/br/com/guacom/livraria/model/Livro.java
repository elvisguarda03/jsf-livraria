package br.com.guacom.livraria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Livro extends BaseEntity {
	private String titulo;
	private String isbn;
	private String dataLancamento;
	private Double preco;

	@ManyToMany
	private List<Autor> autores = new ArrayList<>();

	public List<Autor> getAutores() {
		return autores;
	}
	
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public void adicionaAutor(Autor autor) {
		autores.add(autor);
	}
}