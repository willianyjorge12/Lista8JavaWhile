package exerciciosLista08;
import java.util.Random;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int numeroSecreto = random.nextInt(10) + 1;  // número entre 1 e 10
	        int palpite = 0;

	        System.out.println("Tente adivinhar o número secreto entre 1 e 10!");

	        while (palpite != numeroSecreto) {
	            System.out.print("Digite seu palpite: ");
	            palpite = scanner.nextInt();

	            if (palpite < 1 || palpite > 10) {
	                System.out.println("Por favor, digite um número entre 1 e 10.");
	            } else if (palpite < numeroSecreto) {
	                System.out.println("O número secreto é maior. Tente novamente.");
	            } else if (palpite > numeroSecreto) {
	                System.out.println("O número secreto é menor. Tente novamente.");
	            } else {
	                System.out.println("Parabéns! Você acertou o número secreto!");
	            }
	        }

	        scanner.close();
	    }
}
