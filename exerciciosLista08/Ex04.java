package exerciciosLista08;
import java.util.Scanner;
public class Ex04 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para ver a tabuada: ");
	        int num = scanner.nextInt();

	        int i = 1;
	        while (i <= 10) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	            i++;
	        }

	        scanner.close();
	    }
}
