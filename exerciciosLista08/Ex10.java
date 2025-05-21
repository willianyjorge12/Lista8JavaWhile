package exerciciosLista08;
import java.util.Scanner;
public class Ex10 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String senhaCorreta = "12345";  // Defina aqui a senha correta
	        String senhaDigitada;

	        do {
	            System.out.print("Digite a senha: ");
	            senhaDigitada = scanner.nextLine();

	            if (!senhaDigitada.equals(senhaCorreta)) {
	                System.out.println("Senha incorreta! Tente novamente.");
	            }
	        } while (!senhaDigitada.equals(senhaCorreta));

	        System.out.println("Senha correta! Acesso permitido.");
	        scanner.close();
	    }
}
