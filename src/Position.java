public class Position {
    Dice diceThrow = new Dice();
    public static int position;
    int diceOne = diceThrow.diceOne;
    int diceTwo = diceThrow.diceTwo;
    int diceSum = diceThrow.diceSum;

    public Position(){
        if (position == 0) {
            if (diceOne == 6 && diceTwo == 3 || diceOne == 3 && diceTwo == 6) {
                position = 26;
            } else if (diceOne == 4 && diceTwo == 5 || diceOne == 5 && diceTwo == 4) {
                position = 53;
            } else if (diceSum == 6) {
                position = 12;
            }else{
                position = diceSum;
            }
        }

    }
}
