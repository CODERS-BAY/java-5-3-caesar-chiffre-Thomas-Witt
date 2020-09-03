import java.util.Random;
import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Please input the secret message:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Should it switch at random (press 1) or do you want to choose (press 2)");
        int choice = scanner.nextInt();
        int charjump;
        if (choice == 2) {
            System.out.println("How many places should it jump?");
             charjump = scanner.nextInt();
        } else {
            charjump = rand.nextInt(1000);
        }
        charjump = charjump % 26;
        char[] characters = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            characters[i] = message.charAt(i);             // Copies the message into an Char-Array
        }
        for (int i = 0; i < message.length(); i++) {
            if ((int) characters[i] != 32) {
                if ((int) characters[i] >= 97 && (int) characters[i] <= 122 && ((int) characters[i] + charjump) > 122) {
                    characters[i] = (char) (characters[i] + charjump - 26);
                } else if ((int) characters[i] >= 97 && (int) characters[i] <= 122 && ((int) characters[i] + charjump) < 97) {
                    characters[i] = (char) (characters[i] + charjump + 26);
                } else if ((int) characters[i] >= 65 && (int) characters[i] <= 90 && ((int) characters[i] + charjump) > 90) {
                    characters[i] = (char) (characters[i] + charjump - 26);
                } else if ((int) characters[i] >= 65 && (int) characters[i] <= 90 && ((int) characters[i] + charjump) < 65) {
                    characters[i] = (char) (characters[i] + charjump + 26);
                } else {
                    characters[i] = (char) (characters[i] + charjump);
                }
            }
        }
        for (int i = 0; i < message.length(); i++) {
            System.out.print(characters[i]);
        }
    }
}
