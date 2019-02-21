package classAbstractInterface;

public abstract class Empregado {

	protected String nome;
	
	//Construtor 
	public Empregado(String nome) {
		this.nome = nome;
	}

	public void printPay() {
		System.out.println(this.nome + " ganha " + getPay());
	
	}

	public abstract double getPay();

}
