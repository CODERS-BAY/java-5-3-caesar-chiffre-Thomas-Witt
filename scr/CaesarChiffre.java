import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        String userInput;
        int characterJump;
        System.out.println("Please enter chiffre value:");
        Scanner scanner = new Scanner(System.in);
        characterJump = scanner.nextInt();
        if (characterJump < 0) {
            characterJump = (characterJump % 26) * (-1);
        } else {
            characterJump = characterJump % 26;
        }
        System.out.println("Thank you!\nPlease enter message:");
        Scanner scanner2 = new Scanner(System.in);
        userInput = scanner2.next();
        char[] singleLetter = userInput.toCharArray();
        char[] changedLetter = new char[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            if (i < (26 - characterJump)) {
                changedLetter[i] = (char) (singleLetter[i] + characterJump);
            } else {
                changedLetter[i] = (char) (singleLetter[i] - 26 + characterJump);
            }
        }
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(changedLetter[i]);
        }

    }
}
