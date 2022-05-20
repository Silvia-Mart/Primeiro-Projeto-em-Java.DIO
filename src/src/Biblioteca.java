package src;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
	private List<Livro> livros;
	
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(livros);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		return Objects.equals(livros, other.livros);
	}
	
	@Override
	public String toString() {
		return "Biblioteca [livros=" + livros + "]";
	}
	
	public void visualizarLivros() {
		for (Livro livro : livros) {
		System.out.println(livro.getId()+"  = "+livro.getTitulo()+".");	
		}
	}


}
