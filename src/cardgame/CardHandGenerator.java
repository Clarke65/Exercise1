/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import cardgame.CardTrick.Suit;
import cardgame.CardTrick.Value;
import java.util.Random;
/**
 *
 * @author Dell
 */
public class CardHandGenerator {
    
    
    public static CardTrick[] generateHand (int numCards,
            Value[] cardValues, Suit[] cardSuits) {
        // We'll use Random to generate random numbers
        Random random = new Random();
        
        CardTrick[] hand = new CardTrick[numCards];

        for (int i = 0; i < hand.length; i++) {
            CardTrick.Value value = cardValues[random.nextInt(cardValues.length)];
            CardTrick.Suit suit = cardSuits[random.nextInt(cardSuits.length)];

            CardTrick card = new CardTrick(value, suit);
            hand[i] = card;
        }
        return hand;
    
    }
}
