import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		
		float notaFinal = nota1 + nota2;
		
		if(notaFinal >= 70f) {
			System.out.printf("Aluno aprovado nota final: %.1f%n", notaFinal);
		}
		else {
			System.out.printf("Aluno reprovado nota final: %.1f%n", notaFinal);
		}
		sc.close();

	}

}
