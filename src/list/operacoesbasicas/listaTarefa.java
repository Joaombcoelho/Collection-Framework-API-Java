package list.operacoesbasicas;
import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
//atributo
private List<Tarefa> tarefalist;

public listaTarefa() {
    this.tarefalist = new ArrayList<>();
}
public void adicionarTarefa(String descricao) {
    tarefalist.add(new Tarefa(descricao));
}
public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefalist) {
        if(t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
        }
    }
    tarefalist.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }
    public static void main(String[] args) {
        listaTarefa listaTarefa = new listaTarefa();
        System.out.println("o numero total de elementos é " + listaTarefa.obterNumeroTotalTarefas);
    }
}