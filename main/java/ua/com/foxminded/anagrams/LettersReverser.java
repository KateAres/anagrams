package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class LettersReverser {

    public String reverseLettersInSentence(String inputLine) {
        String[] words = inputLine.split("(?<= )|(?= )");
        StringJoiner joiner = new StringJoiner("");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            String reversedWord = reverseLettersInWord(currentWord);
            joiner.add(reversedWord);
        }
        return joiner.toString();
    }

    private String reverseLettersInWord(String word) {
        char[] currentWord = word.toCharArray();
        int startIndex = 0;
        int endIndex = currentWord.length - 1;
        while (startIndex < endIndex) {
            if (!Character.isAlphabetic(currentWord[startIndex])) {
                startIndex++;
            } else if (!Character.isAlphabetic(currentWord[endIndex])) {
                endIndex--;
            } else {
                swapLetters(currentWord, startIndex, endIndex);
                startIndex++;
                endIndex--;
            }
        }
        return new String(currentWord);
    }

    private void swapLetters(char[] currentWord, int startIndex, int endIndex) {
        char tmp = currentWord[startIndex];
        currentWord[startIndex] = currentWord[endIndex];
        currentWord[endIndex] = tmp;
    }
}
