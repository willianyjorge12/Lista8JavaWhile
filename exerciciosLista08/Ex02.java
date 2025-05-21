package exerciciosLista08;
import java.util.Scanner;
public class Ex02 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro para iniciar a contagem regressiva: ");
	        int numero = scanner.nextInt();

	        while (numero >= 0) {
	            System.out.println(numero);
	            numero--;
	        }

	        System.out.println("Contagem regressiva finalizada!");
	        scanner.close();
	    }
}
