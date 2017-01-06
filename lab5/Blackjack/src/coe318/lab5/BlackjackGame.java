package coe318.lab5;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class BlackjackGame {

    private CardPile deck;
    private CardPile houseCards;
    private CardPile yourCards;
    private boolean houseDone;
    private boolean playerDone;
    private UserInterface ui;

    public BlackjackGame(UserInterface ui) {
        this.ui = ui;
        ui.setGame(this);
        deck = new CardPile();
        for (int i = 2; i < 15; i++) { // make the deck of cards
            for (int j = 0; j < 4; j++) {
                deck.addCard(new Card(i, j, true));
            }
        }
        houseCards = new CardPile();
        yourCards = new CardPile();
        // initialize each player as unfinished
        houseDone = false;
        playerDone = false;
    }

    public void start() {
        Card c;
        c = deck.removeRandom();
        c.setFaceUp(false);
        getHouseCards().addCard(c);
        getHouseCards().addCard(deck.removeRandom());
        getYourCards().addCard(deck.removeRandom());
        getYourCards().addCard(deck.removeRandom());
        ui.display();
    }

    public void play() {
        while (!houseDone || !playerDone) {
            if (!houseDone) {
                if (score(getHouseCards()) <= 17) {
                    getHouseCards().addCard(deck.removeRandom());
                    ui.display();
                } else {
                    houseDone = true;
                }
            }
            if (!playerDone) {
                if (ui.hitMe()) {
                    getYourCards().addCard(deck.removeRandom());
                    ui.display();
                } else {
                    playerDone = true;
                }
            }
        }
    }

    public void end() {
        getHouseCards().getCards().get(0).setFaceUp(true);
        ui.gameOver();
    }

    /**
     * Determine the score of a pile of cards.
     *
     * @param p
     * @return the score
     */
    public int score(CardPile p) {
        int scoreSum = 0;
        for(Card card : p.getCards()){
            scoreSum += card.value();
        }
        return scoreSum;
    }

    /**
     * @return the houseCards
     */
    public CardPile getHouseCards() {
        return houseCards;
    }

    /**
     * @return the yourCards
     */
    public CardPile getYourCards() {
        return yourCards;
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame(new SimpleUI());
        game.start();
        game.play();
        game.end();
    }
}