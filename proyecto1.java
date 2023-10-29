import java.security.SecureRandom;
import java.util.Scanner;

public class proyecto1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int correctas = 0;
        int incorrectas = 0;
        
        // elija el nivel de dificultad

        System.out.println("Elige el nivel de dificultad (1 para números de un dígito, 2 para números de dos dígitos, etc.):");
        int nivel = scanner.nextInt();
