import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double novoSalario = 0.0;
			double reajuste = 0.0;
			double percentualDeAumento = 0.0;
			
			double salarioAtual = sc.nextDouble();
			
			if(salarioAtual >= 0.0 && salarioAtual <= 400.00) {
				novoSalario = salarioAtual / 100.00 * 115.00;
				reajuste = novoSalario - salarioAtual;
				percentualDeAumento = 15;				
			}
			
			else if(salarioAtual >= 400.01 && salarioAtual <= 800.00) {
				novoSalario = salarioAtual / 100.00 * 112.00;
				reajuste = novoSalario - salarioAtual;
				percentualDeAumento = 12;				
			}
			
			else if(salarioAtual >= 800.01 && salarioAtual <= 1200.00) {
				novoSalario = salarioAtual / 100.00 * 110.00;
				reajuste = novoSalario - salarioAtual;
				percentualDeAumento = 10;				
			}
			
			else if(salarioAtual >= 1200.01 && salarioAtual <= 2000.00) {
				novoSalario = salarioAtual / 100.00 * 107.00;
				reajuste = novoSalario - salarioAtual;
				percentualDeAumento = 7;				
			}
			
			else if(salarioAtual >= 2000.00) {
				novoSalario = salarioAtual / 100.00 * 104.00;
				reajuste = novoSalario - salarioAtual;
				percentualDeAumento = 4;				
			}			

			System.out.printf("Novo Salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentualDeAumento);
			
		sc.close();

	}

}
