
public class PagamentoBoleto implements PagamentoCommand{
	
	double numero = Math.random() * 100;

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Boleto Criado!" + numero + compra.getInfoNota());
	}
	
}
