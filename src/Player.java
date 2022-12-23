public class Player {
    int position = Position.position;
    Dice diceOnePlayer = new Dice();
    Dice diceTwoPlayer = new Dice();

    public String name;
    public Player(String name, int position) {
        this.name = name;
        this.diceOnePlayer = new Dice().diceOne;
        this.diceTwoPlayer = new Dice().diceTwo;
        this.position = position;
       }
    }

