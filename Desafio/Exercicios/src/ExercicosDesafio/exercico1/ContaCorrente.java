package ExercicosDesafio.exercico1;

public class ContaCorrente extends Conta {

	private double saldo;
	private double rendimentoMensal;

	public double calculaRendimento(double saldo) {
		return saldo;
		

}

	public ContaCorrente(double saldo, double rendimentoMensal) {
		super();
		this.saldo = saldo;
		this.rendimentoMensal = rendimentoMensal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
}