import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine();

        System.out.print("Enter the key (a non-negative integer): ");
        int key = scanner.nextInt();

        String ciphertext = encrypt(plaintext, key);

        System.out.println("Ciphertext: " + ciphertext);

        scanner.close();
    }

    // Function to encrypt the plaintext using Caesar's cipher
    private static String encrypt(String plaintext, int key) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                // Determine whether the letter is uppercase or lowercase
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';

                // Apply Caesar's cipher formula
                char encryptedChar = (char) ((currentChar - base + key) % 26 + base);

                // Append the encrypted character to the ciphertext
                ciphertext.append(encryptedChar);
            } else {
                // If the character is not a letter, leave it unchanged
                ciphertext.append(currentChar);
            }
        }

        return ciphertext.toString();
    }
}
