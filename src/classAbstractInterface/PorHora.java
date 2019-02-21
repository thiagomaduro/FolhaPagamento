package classAbstractInterface;

public class PorHora extends Empregado{

	private double valorHora;
	private int numHora;
	
	//Construtor
	public PorHora(String nome) {
		super(nome);
	}

	public void setValorHora(double v) {
		this.valorHora = v;
	}
	
	public void setNumHora(int v) {
		this.numHora = v;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public int getNumHora() {
		return numHora;
	}
	
	@Override //Não sabia
	public double getPay() {
		double resul = valorHora * numHora;
		return resul;
	}

}
