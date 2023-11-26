//Kenneth Ortega
public class CaesarEncrypt {

    // Function to encrypt the plaintext using Caesar's cipher
    public static String encrypt(String plaintext, int key) {
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
