import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Notebook";
		String produto2 = "Mesa de Computador";
		
		int idade = 38;
		int codigo = 12345;
		char genero = 'M';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf(produto1 + " custa R$%.2f%n", preco1);
		System.out.printf(produto2 + " custa R$%.2f%n", preco2);
		
		System.out.println("Registro: " + idade + " anos, Seu código é: " + codigo + " é do genero: " + genero);
		System.out.printf("medida com oito casas decimais %.8f%n" , medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal Estados Unidos %.3f%n", medida);

		
	}

}
