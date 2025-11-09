package entities;

public class Empregado {
	public String nome;
	public double salariobruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salariobruto - taxa;
	}
	
	public void incresentarSalario(double porcentagem) {
		 salariobruto += salariobruto * porcentagem/100;
	}
	
}
