import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.12345;
		int y = 32;
		
		System.out.println("Olá, Mundo!");
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		
		double resultado = x + y;
		
		System.out.println(x + " + " + y + " = " + resultado);
	}

}
