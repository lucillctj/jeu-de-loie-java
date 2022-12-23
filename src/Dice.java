public class Dice {
    int diceOne;
    int diceTwo;
    int diceSum;
    public int getDiceOne() {
        return diceOne = 1 + (int) (Math.random() * 6);
    }
    public int getDiceTwo() {
        return diceTwo = 1 + (int) (Math.random() * 6);
    }

    public Dice() {
        this.diceOne = getDiceOne();
        this.diceTwo = getDiceTwo();
        this.diceSum = (diceOne + diceTwo);
    }
}