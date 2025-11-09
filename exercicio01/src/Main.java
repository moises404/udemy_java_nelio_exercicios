import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.print("Nome:");
		emp.nome = sc.nextLine();
		
		
		System.out.print("Salario Bruto:");
		emp.salariobruto = sc.nextDouble();
		
		System.out.print("Taxa:");
		emp.taxa = sc.nextDouble();
		
		System.out.println("Empregado:" + emp.nome + ", $ " + String.format("%.2f", emp.salarioLiquido()));
		
		System.out.print("Qual a porcentagem da taxa para acresentar no salario?:");
		double taxaIncresentarSalario = sc.nextDouble();
		
		emp.incresentarSalario(taxaIncresentarSalario);
		
		System.out.print("Dados atualizados: " + emp.nome + ", $ " + String.format("%.2f", emp.salarioLiquido()));
		
		sc.close();
		
		

	}

}
