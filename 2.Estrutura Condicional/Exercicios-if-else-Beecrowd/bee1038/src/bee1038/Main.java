package bee1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoDoItem = sc.nextInt();
		int quantidadeDoItem = sc.nextInt();
		double totalAPagar;
		
		
		if(codigoDoItem == 1) {
			totalAPagar = quantidadeDoItem * 4.00;
			System.out.printf("Total: R$ %.2f%n", totalAPagar);
		}
		else if(codigoDoItem == 2) {
			totalAPagar = quantidadeDoItem * 4.50;
			System.out.printf("Total: R$ %.2f%n", totalAPagar);
		}
		else if(codigoDoItem == 3) {
			totalAPagar = quantidadeDoItem * 5.00;
			System.out.printf("Total: R$ %.2f%n", totalAPagar);
		}
		else if(codigoDoItem == 4) {
			totalAPagar = quantidadeDoItem * 2.00;
			System.out.printf("Total: R$ %.2f%n", totalAPagar);
		}
		else if(codigoDoItem == 5) {
			totalAPagar = quantidadeDoItem * 1.50;
			System.out.printf("Total: R$ %.2f%n", totalAPagar);
		}
		
		else {
			System.out.println("Codigo Invalido: ");
		}		
			
		sc.close();

	}

}
