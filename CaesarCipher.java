//Kenneth Ortega
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //Get user input for the key
        System.out.print("Enter the key (a non-negative integer): ");
        int key = scanner.nextInt();
        //consume the newline character
        scanner.nextLine();
        //Get user input for plaintext
        System.out.print("Enter a word or phrase: ");
        String plaintext = scanner.nextLine();
        //encrypt the phrase
        String ciphertext = CaesarEncrypt.encrypt(plaintext, key);
        //print out the encryption
        System.out.println("Ciphertext: " + ciphertext);
        scanner.close();
    }
}
