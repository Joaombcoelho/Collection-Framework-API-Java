package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	//atributo
	private List<Pessoa> pessoaList;
		
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	 public List<Pessoa> ordenarPorIdade() {
		 List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		 Collections.sort(pessoasPorIdade);
		 return pessoasPorIdade;
	 }
	 
	 public List<Pessoa> ordenarPorAltura(){
		 List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		 Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		 return pessoasPorAltura;
		 	 }
		
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		ordenacaoPessoas.adicionarPessoa("Angela", 28, 1.80);
		ordenacaoPessoas.adicionarPessoa("Marcio", 30, 1.56);
		ordenacaoPessoas.adicionarPessoa("Joao", 20, 1.98);
		ordenacaoPessoas.adicionarPessoa("Samara", 33, 1.77);
		
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());

	}

}
