package ua.com.foxminded.anagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LettersReverser lettersSwapping = new LettersReverser();
        String inputLine = inputText();
        System.out.println(lettersSwapping.reverseLettersInSentence(inputLine));
    }

    private static String inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type words: ");
        String inputLine = scanner.nextLine();
        return inputLine;
    }
}
