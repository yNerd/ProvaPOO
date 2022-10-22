package classes;
import classes.Produto;

public class Venda extends Produto{
    String data;
    int qtdVendida;


    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getQtdVendida() {
        return qtdVendida;
    }
    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }


    
}
