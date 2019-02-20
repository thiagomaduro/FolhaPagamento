package classAbstractInterface;

public abstract class Empregado {

	private String nome;
	
	//Construtor 
	public Empregado(String nome) {
		
	}

	public void printPay() {
		System.out.printf("% ganha: %", this.nome, getPay());
	}

	public abstract double getPay();

}
