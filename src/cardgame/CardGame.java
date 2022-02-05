package cardgame;

import cardgame.CardTrick.Suit;
import cardgame.CardTrick.Value;
import java.util.Random;
import java.util.Scanner;

/**
 * This class models a simple card guessing game
 * 
 * @author Ashley Clarke Feb 4 2022
 */
public class CardGame {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //I'm DONE!!
        System.out.println("I am editing the code in Github. Hello - I am Ashe, and this is my first time using Github. I am excited to continue using this resource.");

           Scanner input = new Scanner(System.in);
           
           Value[] cardValues = Value.values();

        Suit[] cardSuits = Suit.values();
        
        CardTrick[] hand = cardgame.CardHandGenerator.generateHand(7, cardValues, cardSuits);



        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
        for (CardTrick card : hand) {
            System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < cardSuits.length; i++) {
            System.out.println((i + 1) + ": " + cardSuits[i]);
        }
        int suitPosition = input.nextInt() - 1;

        System.out.println("Enter a value");
        for (int i = 0; i < cardValues.length; i++) {
            System.out.println((i + 1) + ": " + cardValues[i]);
        }

        int valuePosition = input.nextInt() - 1;

        CardTrick userGuess = new CardTrick(cardValues[valuePosition], 
                cardSuits[suitPosition]);

        boolean match = false;
        for (CardTrick card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit()== userGuess.getSuit()) {
                match = true;
                break;
            }
        }

        String response = match ? "Right guess" : "No match";

        System.out.println(response);
    }

}
