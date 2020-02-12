import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        String userInput;
        int characterJump = 6;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.next();
        char[] singleLetter = userInput.toCharArray();
        char[] changedLetter = new char[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            if (i < (26 - characterJump)) {
                changedLetter[i] = (char) (singleLetter[i] + characterJump);
            } else {
                changedLetter[i] = (char) (singleLetter[i] + characterJump);
            }
        }
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(changedLetter[i]);
        }

    }
}
