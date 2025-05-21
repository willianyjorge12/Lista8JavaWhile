package exerciciosLista08;
import java.util.Scanner;
public class Ex03 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        System.out.println("Digite números positivos para somar. Digite um número negativo para parar.");

	        while (true) {
	            System.out.print("Digite um número: ");
	            int num = scanner.nextInt();

	            if (num < 0) {
	                break;
	            }

	            soma += num;
	        }

	        System.out.println("Total da soma dos números positivos: " + soma);
	        scanner.close();
	    }
}
