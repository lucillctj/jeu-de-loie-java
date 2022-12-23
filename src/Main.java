public class Main {
    ////public static void main(String[] args) {
       //int Dice = new Dice_Throw().dice();
       //System.out.println(Dice);
    //}
    public static void main(String[] args) {
        Player playerA = new Player("A", 0, 0);
        System.out.println(playerA.name);
        System.out.println(playerA.getDiceResult());
    }
}