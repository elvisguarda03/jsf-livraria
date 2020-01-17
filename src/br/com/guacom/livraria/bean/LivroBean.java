package br.com.guacom.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.guacom.livraria.model.Livro;

@ManagedBean
public class LivroBean {
	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando livro " + livro.getTitulo());
	}
}
