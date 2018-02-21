
public class Teste {
	public static void main(String[] args) {
		Loja africanas = new Loja("Africanas");
		africanas.executarCompra(1000., new PagamentoBoleto());
	}
}
