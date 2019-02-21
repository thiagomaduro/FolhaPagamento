package classAbstractInterface;

public class PorHoraeComissao extends PorHora implements Commission{

	private double vendas;
	
	//Construtor
	public PorHoraeComissao(String nome) {
		super(nome);
	}
	public void setVendas(double s) {
		this.vendas = s;
	}
	//VERIFICAR
	public void printPay() {
		System.out.println("o pagamento por hora eh: " + getValorHora() * getNumHora());
		System.out.println("o pagamento por comissao eh: " + COMMISSION_RATE * vendas);
		
	}
	//tinha feito errado
	public double getPay() {
		double resul = getValorHora() * getNumHora() + COMMISSION_RATE * vendas;
		
		return resul;
	}

}
