public class Dice_Throw {
    public int dice ()
 {
        int randomNumA = 1 + (int) (Math.random() * 6);
        int randomNumB = 1 + (int) (Math.random() * 6);

        return(randomNumA + randomNumB);
    }
}