public class Main {
    public static void main(String[] args) {
        Player playerA = new Player("A");
        System.out.println(playerA.name);

        Dice myDice = new Dice();
        System.out.println(myDice.getDiceOne());

    }
}