import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double salario = sc.nextDouble();
			double imposto = 0.0;
			
			if(salario <= 2000.00) {
				imposto = 0.0;
				System.out.println("Insento");
			}
			else if(salario >= 2000.01 && salario <= 3000.00) {
				imposto = (salario - 2000.00) * 0.08;
				System.out.printf("RS %.2f%n",imposto);
			}
			else if(salario >= 3000.01 && salario <= 4500.00) {
				imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
				System.out.printf("RS %.2f%n",imposto);
			}
			else {
				imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
				System.out.printf("RS %.2f%n",imposto);
			}
					
		sc.close();

	}

}
