public class Healer extends Character {
    public static void heal(Character character) {
        character.health = character.maxHealth;
        System.out.println("You have been restored to full health.");
    }
}
