package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LettersReverserTest {

    LettersReverser reverser = new LettersReverser();

    @Test
    void createReversedStringShouldReturnInputStringWhenItContainsOnlySpecialSymbols() {
        String actual = reverser.reverseLettersInSentence("/%?&&&& *&?##");
        String expected = "/%?&&&& *&?##";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnInputStringWhenItContainsOnlySpaces() {
        String actual = reverser.reverseLettersInSentence("                   ");
        String expected = "                   ";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnInputStringWhenItIsEmpty() {
        String actual = reverser.reverseLettersInSentence("");
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnReversedWordsWhenItContainsOnlyLetters() {
        String actual = reverser.reverseLettersInSentence("abcd efgh");
        String expected = "dcba hgfe";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnReversedWordsReverseOnlyLettersWhenItContaisWordsWithSpecialSymbols() {
        String actual = reverser.reverseLettersInSentence("a1bcd efg!h");
        String expected = "d1cba hgf!e";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnUntrimmedStringWhenItContainsSpacesAfterWords() {
        String actual = reverser.reverseLettersInSentence("    gate    ");
        String expected = "    etag    ";
        assertEquals(expected, actual);
    }

    @Test
    void createReversedStringShouldReturnReversedWordsWithMedialSpacesWhenItContainsWordsWithMedialSpaces() {
        String actual = reverser.reverseLettersInSentence("joll         hd");
        String expected = "lloj         dh";
        assertEquals(expected, actual);
    }
}

