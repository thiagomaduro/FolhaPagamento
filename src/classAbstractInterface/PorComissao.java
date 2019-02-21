package classAbstractInterface;

public class PorComissao extends Empregado implements Commission{

	private double vendas;

	// Construtor
	public PorComissao(String nome) {
		super(nome);
			
	}
	
	public void setVendas(double s) {
		this.vendas = s;
	}

	@Override
	public double getPay() {
		double resul = vendas * Commission.COMMISSION_RATE; 
		return resul;
	}

}
