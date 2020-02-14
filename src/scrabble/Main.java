package scrabble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true){
            System.out.println("Type a word (type 'q' to quit)");
            Scanner scanner = new Scanner(System.in);
            String wordinput = scanner.nextLine();
            if (wordinput.equals("q")) {
                System.out.println("Quitting...");
                break;
            }else{
                int value = Scrabble.getScrabbleWordValue(wordinput);
                System.out.println("Word: "+wordinput+" | Value: "+value);
            }
        }
    }
}
