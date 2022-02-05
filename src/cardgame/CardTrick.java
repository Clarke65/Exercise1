/*
 * 
 */
package cardgame;

/**
 *
 */
public class CardTrick {

    
    
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS, STAR
        }
    
    public enum Value{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
    NINE, TEN, JACK, QUEEN, KING, EMPEROR
    }
    
    private Value value;
    private Suit suit;
    
    public CardTrick (Value value, Suit suit){
        this.value = value;
        this.suit = suit;
    }
    
    public Value getValue(){
        return this.value;
    }
    
    /**
     * 
     * @param value
     */
    
    public void setValue (Value value){
        this.value = value;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    /**
     * 
     * @param suit
     */
    
    public void setSuit(Suit suit){
        this.suit = suit;
    }
}





