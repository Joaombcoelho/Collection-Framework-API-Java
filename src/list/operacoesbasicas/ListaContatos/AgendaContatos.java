package list.OperacoesBasicas.ListaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;
	
	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}
 public void adicionarContato(String nome, int numero) {
	 contatoSet.add(new Contato(nome, numero));
 }
public void exibirContatos() {
	System.out.println(contatoSet);
}
public Set<Contato> pesquisarPorNome(String nome) {
	Set<Contato> contatosPorNome = new HashSet<>();
	for(Contato c : contatoSet) {
		if(c.getNome().startsWith(nome)) {
			contatosPorNome.add(c);
		}
	}
	return contatosPorNome;
}
 public Contato atualizarNumeroContato(String nome, int novoNumero) {
	 Contato contatoAtualizado = null;
	 for (Contato c : contatoSet) {
		 if(c.getNome().equalsIgnoreCase(nome)) {
			 c.setNumero(novoNumero);
			 contatoAtualizado = c;
			 break;
		 }
	 }
	 return contatoAtualizado;
 }

	public static void main(String[] args) {
	AgendaContatos agendaContatos = new AgendaContatos();
	
	agendaContatos.exibirContatos();
	
	agendaContatos.adicionarContato("Joao", 99999999);
	agendaContatos.adicionarContato("Samara", 99999875);
	agendaContatos.adicionarContato("José", 99999568);
	agendaContatos.adicionarContato("Joao Manoel", 99999879);

	agendaContatos.exibirContatos();
	
	System.out.println(agendaContatos.pesquisarPorNome("Joao"));
	
	System.out.println("Contato Atualizado" + agendaContatos.atualizarNumeroContato("Joao Manoel", 984097974));
	agendaContatos.exibirContatos();
	}
}
