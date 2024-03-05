import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valo1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		
		int menor, meio, maior;
		if (valo1 <= valor2) {
			if (valo1 <= valor3) {
				menor = valo1;
				if (valor2 <= valor3) {
					meio = valor2;
					maior = valor3;
				} else {
					meio = valor3;
					maior = valor2;
				}
			} else {
				menor = valor3;
				meio = valo1;
				maior = valor2;
			}
		} else {
			if (valor2 <= valor3) {
				menor = valor2;
				meio = valor3;
				maior = valo1;
			} else {
				menor = valor3;
				meio = valor2;
				maior = valo1;
			}
		}
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);		
		System.out.println();		
		System.out.println(valo1);
		System.out.println(valor2);
		System.out.println(valor3);
		
		sc.close();

	}

}
