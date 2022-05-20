package src;

import java.util.List;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		Biblioteca bibliotecas = new Biblioteca(List.of( new Livro(1, "Para Sempre","BLA BLA BLA 01",
				250), new Livro(2, "Ponte Para Terabítia","BLA BLA BLA 02",300)));
	
		bibliotecas.visualizarLivros();
	
		/*int a = 1;
		int b = 9;
		System.out.println("HELLO WORLD! " + (a+b));*/

	}

}
