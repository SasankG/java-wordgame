import java.util.Arrays;
import java.util.Scanner;

public class test {
    // Generate words
    static void wordGen() {

        String[] wordList = { "javascript", "java", "csharp", "python", "perl", "golang", "matlab", "php" };

        // Get a random number
        int randomNum = (int) Math.floor((Math.random() * (wordList.length)));

        // Get a random word
        String randWord = wordList[randomNum];

        blankGen(randWord);

    }

    // Makes blank form of words
    static void blankGen(String word) {

        int lengthOf = word.length();

        char[] blanks = new char[lengthOf];

        Arrays.fill(blanks, '_');

        game(blanks, word);

    }

    // Game
    static void game(char[] blanks, String gameWord) {
        // Stringbuilder that can change b/w blanks and letters
        StringBuilder temp;

        Scanner input = new Scanner(System.in);

        // set temp to a new stringbuilder made from blanks
        temp = new StringBuilder(new String(blanks));

        // intro dialog
        System.out.println("Welcome to Java Hangman!");
        System.out.println("Try to guess the word!");
        System.out.println("You have 8 tries! The word is " + gameWord.length() + " letters long");
        System.out.println(blanks);

        for (int lives = 0; lives < 8; lives++) {
            String guess = input.nextLine();

            // single letter guesses
            if (guess.length() != 1) {
                System.out.println("Single letter guesses only!");
                continue;
            }

            // get single letter guess
            char c = guess.charAt(0);

            // int i = where c is located in word where else c is in the word
            for (int i = gameWord.indexOf(c); i >= 0; i = gameWord.indexOf(c, i + 1)) {
                // set temp at where i = c to c
                temp.setCharAt(i, c);
                System.out.println("Correct! Keep Going");
            }

            // reprint the temp with changes made
            System.out.println(temp.toString());

            // If they win
            if (gameWord.equals(temp.toString())) {
                System.out.println("You Win!");
                break;
            }

            // If the lose
            if (lives == 7) {
                System.out.println("You're out of lives! The word was " + gameWord + "!");
            }
        }

    }

    public static void main(String[] args) {
        wordGen();
    }

}