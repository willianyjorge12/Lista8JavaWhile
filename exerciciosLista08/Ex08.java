package exerciciosLista08;
import java.util.Scanner;
public class Ex08 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();

	        int contadorVogais = 0;
	        String vogais = "aeiouAEIOU";

	        for (int i = 0; i < palavra.length(); i++) {
	            char c = palavra.charAt(i);
	            if (vogais.indexOf(c) != -1) {
	                contadorVogais++;
	            }
	        }

	        System.out.println("A palavra contém " + contadorVogais + " vogal(is).");
	        scanner.close();
	    }
}
