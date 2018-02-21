
public class Compra {

	protected int idNotaFiscal;
    protected String nomeDaLoja;
    protected double valorTotal;
 
    public Compra(String nomeDaLoja) {
        this.nomeDaLoja = nomeDaLoja;
    }
 
    public void setValor(double valor) {
        this.valorTotal = valor;
    }
 
    public String getInfoNota() {
        return new String("\nLoja: " + nomeDaLoja + "\nValor: " + valorTotal);
    }
}
