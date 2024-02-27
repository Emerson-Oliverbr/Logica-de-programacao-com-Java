import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double valorTotalDeVendas = sc.nextDouble();
		
		double salarioTotal = salarioFixo + valorTotalDeVendas * 0.15;
		
		System.out.println("Vendedor: " + nomeVendedor);
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		
		sc.close();

	}

}
