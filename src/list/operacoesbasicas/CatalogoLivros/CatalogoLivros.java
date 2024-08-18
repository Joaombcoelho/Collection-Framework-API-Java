package list.OperacoesBasicas.CatalogoLivros;
 import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
	//Atributo
	private List <Livro> livrolist;

	public CatalogoLivros() { this.livrolist = new ArrayList<>();
	}
	
	public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
		livrolist.add(new Livro (titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2011);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 3", 2022);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1996);
	
		System.out.println(catalogoLivros.pesquisarPorAutor ("Autor 2"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}

}
