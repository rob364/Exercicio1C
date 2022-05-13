import java.util.Locale;
import java.util.Scanner;

public class Exercicio1C {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c; 
		System.out.println("Primeiro valor negativo " + a);
		
		System.out.println("Segundo valor positivo " + b);
		
		c = a + b;
		
		System.out.println("SOMA = " + c);
		
		sc.close();
		//Parei na 2

	}

}
