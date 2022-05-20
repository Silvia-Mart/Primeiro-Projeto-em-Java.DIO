package src;

import java.util.Objects;

public class Livro {
	private Integer id;
	private String titulo;
	private String autor;
	private Integer npag;
	
	
	public Livro() {
		
	}
	
	public Livro(Integer id, String titulo, String autor, Integer npag) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.npag = npag;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Integer getNpag() {
		return npag;
	}
	
	public void setNpag(Integer npag) {
		this.npag = npag;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(autor, id, npag, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(id, other.id) && Objects.equals(npag, other.npag)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", npag=" + npag + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
