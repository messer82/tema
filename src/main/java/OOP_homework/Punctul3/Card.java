package OOP_homework.Punctul3;

public class Card {

    private long card;

    public long getCard() {
        return this.card;
    }

    public void setCard(long fCard) {
        this.card = fCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card=" + card +
                '}';
    }
}
