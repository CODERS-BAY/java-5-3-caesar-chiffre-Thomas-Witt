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
            changedLetter[i] = (char) (singleLetter[i] + characterJump);

        }

        int x = 'a';
        System.out.println(x);
        System.out.println((char) 97);


    }
}
