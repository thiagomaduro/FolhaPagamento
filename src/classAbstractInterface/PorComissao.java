package classAbstractInterface;

public class PorComissao extends Empregado {

	private double sales;

	// Construtor
	public PorComissao() {

	}

	@Override
	public double getPay() {
		this.sales = getPay(); //verificar se esta correto!
		return 0;
	}

}
