package ExercicosDesafio.exercico1;

public abstract class Conta {
 
	private String titular;
	private int numero;
	protected final double saldo;
	private double rendimentoMensal;
	
	public Conta(String titular, int numero) {
		this.titular = "Leticia";
		this.numero = 123456789;
		
	}
	
	
public double rendimentoMensal(double saldo. double rendimentoMensal) {
	return ;
	
}
public String getTitular() {
	return titular;
}


public void setTitular(String titular) {
	this.titular = titular;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


public double getRendimentoMensal() {
	return rendimentoMensal;
}


public void setRendimentoMensal(double rendimentoMensal) {
	this.rendimentoMensal = rendimentoMensal;
}


public double getSaldo() {
	return saldo;
}
}
