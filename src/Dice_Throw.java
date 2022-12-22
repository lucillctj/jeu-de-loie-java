import java.util.Scanner;
public class Dice_Throw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Try to throw dices ? (y/n)");
        input.nextLine();
        //if (input.nextLine = 'y') {}
        int randomNumA = 1 + (int) (Math.random() * 6);
        int randomNumB = 1 + (int) (Math.random() * 6);

        System.out.println("First dice score is " + randomNumA);
        System.out.println("Second dice score is " + randomNumB);

    }
}