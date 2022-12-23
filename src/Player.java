public class Player {

    public String name;
    public int position;
    public int diceSum;

    public Player(String name, int diceSum, int position) {
        this.name = name;
        this.diceSum = new Dice_Throw().dice();
        this.position = position;
    }

    public int getDiceResult() {
        return diceSum;
    }

}
