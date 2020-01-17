package br.com.guacom.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.guacom.livraria.model.Autor;

@ManagedBean
public class AutorBean {
	private Autor autor = new Autor();
	
	public Autor getAutor() {
		return autor;
	}
	
	public void gravar() {
		System.out.println("Gravando autor " + autor.getNome());
	}
}
