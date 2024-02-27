import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int menor;
		
		if(n1 < n2 && n1 < n3) {
			menor = n1;
		}
		else if(n2 < n1 && n2 < n3) {
			menor = n2;
		}
		else {
			menor = n3;
		}
		System.out.println("Menor = " + menor);
		
		sc.close();		

	}

}
