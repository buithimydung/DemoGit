package task1;
public class Task2_1 {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int shift;

    public Task2_1(int shift) {
        this.shift = shift;
    }

    public char encryptChar(char c) {
        if (Character.isUpperCase(c)) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int encryptedIndex = (index + shift) % 26;
                return ALPHABET.charAt(encryptedIndex);
            }
        }
        return c;
    }
 // Encrypt a text using the above function for encrypting a charater.
    public String encrypt(String input) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            char encryptedChar = encryptChar(c);
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }
 // Decrypt a character according to the given shif steps.
 // Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET array 
    public char decryptChar(char c) {
        if (Character.isUpperCase(c)) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int decryptedIndex = (index - shift + 26) % 26;
                return ALPHABET.charAt(decryptedIndex);
            }
        }
        return c;
    }

    public String decrypt(String input) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            char decryptedChar = decryptChar(c);
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Task2_1 cipher = new Task2_1(3); // Shift by 3 positions

        String plaintext = "HELLO";
        String encryptedText = cipher.encrypt(plaintext);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = cipher.decrypt(encryptedText);
        System.out.println("Decrypted: " + decryptedText);
    }
}
