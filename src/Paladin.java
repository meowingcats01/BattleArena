import java.util.Random;

public class Paladin extends Character {
    public static boolean blockDamage(Character character) {
        Random blockProbability = new Random();
        if(blockProbability.nextInt(100) > 50) {
            return true;
        } else {
            return false;
        }
    }
}
