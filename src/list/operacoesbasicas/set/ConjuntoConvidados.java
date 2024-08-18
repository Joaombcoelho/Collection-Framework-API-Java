package list.OperacoesBasicas.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		super();
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover =null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);

	}
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
	ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
	System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados " +  "dentro do set convidados");
	
conjuntoConvidados.adicionarConvidado("Joao Manoel", 1203);
conjuntoConvidados.adicionarConvidado("Samara", 2802);
conjuntoConvidados.adicionarConvidado("Joao Coelho", 10116);
conjuntoConvidados.adicionarConvidado("Samara Dias", 2011);
conjuntoConvidados.adicionarConvidado("Convidado 1", 1204);
	System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados " +  "Dentro do set convidados");

//conjuntoConvidados.removerConvidadoPorCodigoConvite(2011);
	//System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados " +  "Dentro do set convidados");
	
conjuntoConvidados.exibirConvidados();
System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados " +  "Dentro do set convidados");
	}

	

}
