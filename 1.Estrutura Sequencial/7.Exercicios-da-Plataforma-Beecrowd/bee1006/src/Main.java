import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double media = (A*2.0 + B*3.0 + C*5.0) / 10.0;
		
		System.out.printf("Media = %.1f%n",media);
		
		sc.close();

	}

}
