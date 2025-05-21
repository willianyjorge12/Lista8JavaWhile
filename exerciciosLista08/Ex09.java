package exerciciosLista08;
import java.util.Scanner;
public class Ex09 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
	        int numero = scanner.nextInt();

	        if (numero < 0) {
	            System.out.println("Número inválido! O fatorial é definido apenas para números não negativos.");
	        } else {
	            long fatorial = 1;
	            int i = 1;

	            while (i <= numero) {
	                fatorial *= i;
	                i++;
	            }

	            System.out.println("O fatorial de " + numero + " é: " + fatorial);
	        }

	        scanner.close();
	    }
}
