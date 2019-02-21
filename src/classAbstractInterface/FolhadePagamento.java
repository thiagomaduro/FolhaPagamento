package classAbstractInterface;

public class FolhadePagamento {
	public static void main(String[] args) {
		
		PorHoraeComissao hora = new PorHoraeComissao("teste");
		hora.setNumHora(5);
		hora.setValorHora(10);
		hora.printPay();
		
		
		
		PorComissao comissao = new PorComissao("thiago");
		comissao.setVendas(10);
		comissao.printPay();
		
		
	}

}
