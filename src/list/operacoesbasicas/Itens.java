package list.OperacoesBasicas;

public class Itens {
    private String nome
    private doble preco
    private int quant

    public Item (String nome, doble preco, int quant){
            this.nome = nome;
            this.preco = preco;
            this.quant = quant;
    }

    public String guetnome(){
            return nome;
    }

    public double guetpreco(){
        return preco;
    }

    public int guetquant(){
        return quant;
    }

    @Override
    public String toString() {
        return "Itens [nome=" + nome + '\'' + ", preco=" + preco + ", quant=" + quant + "]";
    }
    

}

