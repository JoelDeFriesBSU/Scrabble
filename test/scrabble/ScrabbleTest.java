package scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {

    @Test
    void testNormalWord() {
        String word = "normal";
        assertEquals(8,Scrabble.getScrabbleWordValue(word));
    }

    @Test
    void testLongWord() {
        String word = "impedimenta";
        assertEquals(18,Scrabble.getScrabbleWordValue(word));
    }

    @Test
    void testShortWord() {
        String word = "the";
        assertEquals(6,Scrabble.getScrabbleWordValue(word));
    }

    @Test
    void testOneLetterWord() {
        String word = "a";
        assertEquals(1,Scrabble.getScrabbleWordValue(word));
    }

    @Test
    void testSymbols() {
        String word = "normal&#";
        assertEquals(8,Scrabble.getScrabbleWordValue(word));
    }

    @Test
    void testCaseSensitivity() {
        String word = "NorMaL";
        assertEquals(8,Scrabble.getScrabbleWordValue(word));
    }
}