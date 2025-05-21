package exerciciosLista08;
import java.util.Scanner;
public class Ex06 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double soma = 0;
	        int contador = 0;

	        System.out.println("Digite notas entre 0 e 10. Para encerrar, digite um número fora dessa faixa.");

	        while (true) {
	            System.out.print("Digite uma nota: ");
	            double nota = scanner.nextDouble();

	            if (nota < 0 || nota > 10) {
	                break;
	            }

	            soma += nota;
	            contador++;
	        }

	        if (contador > 0) {
	            double media = soma / contador;
	            System.out.printf("Média das notas: %.2f%n", media);
	        } else {
	            System.out.println("Nenhuma nota válida foi digitada.");
	        }

	        scanner.close();
	    }
}
