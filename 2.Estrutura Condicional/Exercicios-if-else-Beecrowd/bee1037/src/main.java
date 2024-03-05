import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorDeEntrada = sc.nextDouble();
		
		if (valorDeEntrada < 0.0 || valorDeEntrada > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (valorDeEntrada <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (valorDeEntrada <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (valorDeEntrada <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();	

	}

}
