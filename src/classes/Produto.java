package classes;

public class Produto {
    int codigo;
    String nome;
    float valor;
    int qtdEstoque;



    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    @Override
    public String toString() {
        return "Nome:" + getNome() + "\n" + "Valor:" + getValor() + "\n" + "Codigo:" + getCodigo() + "\n" + "Quantidade No Estoque:" + getQtdEstoque();
}

}
