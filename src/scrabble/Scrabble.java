package scrabble;
import java.util.*;
public class Scrabble {

    public static int letterValue(char letter){
        List<Character> onePoints = Arrays.asList('e','a','i','o','n','r','t','l','s','u');
        List<Character> twoPoints = Arrays.asList('d','g');
        List<Character> threePoints = Arrays.asList('b','c','m','p');
        List<Character> fourPoints = Arrays.asList('f','h','v','w','y');
        List<Character> fivePoints = Arrays.asList('k');
        List<Character> eightPoints = Arrays.asList('j','x');
        List<Character> tenPoints = Arrays.asList('q','z');

        if(onePoints.contains(letter)){
            return 1;
        }else if(twoPoints.contains(letter)){
            return 2;
        }else if(threePoints.contains(letter)){
            return 3;
        }else if(fourPoints.contains(letter)){
            return 4;
        }else if(fivePoints.contains(letter)){
            return 5;
        }else if(eightPoints.contains(letter)){
            return 8;
        }else if (tenPoints.contains(letter)){
            return 10;
        }else{
            return 0;
        }
    }


    public static int getScrabbleWordValue(String word){
        int value = 0;
        String[] split = word.split("");
        for(String c : split){
            String cLower = c.toLowerCase();
            char realChar = cLower.charAt(0);
            int charTempValue = letterValue(realChar);
            value += charTempValue;
        }

        return value;
    }

}
