import java.util.HashMap;

public class Character {
    // Set the character's basics
    static String name, type;
    static int strength, defense, health, maxHealth, experience;
    static int defaultStrength, defaultDefense, defaultHealth;
    static boolean magicAbility = false;
    static int defaultExperience = 0;
    static HashMap<String, Integer> playerData = new HashMap<String, Integer>();
    public static void showStats() {
        System.out.println("Your stats are:");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
        System.out.println("Experience (XP): " + experience);
    }
    public static void setStats(int strength, int defense, int health, int maxHealth, int experience) {
        if(playerData.containsKey("Strength")) {
            playerData.remove("Strength");
        }
        if(playerData.containsKey("Defense")) {
            playerData.remove("Defense");
        }
        if(playerData.containsKey("Health")) {
            playerData.remove("Health");
        }
        if(playerData.containsKey("Max Health")) {
            playerData.remove("Max Health");
        }
        if(playerData.containsKey("Experience")) {
            playerData.remove("Experience");
        }
        playerData.put("Strength", strength);
        playerData.put("Defense", defense);
        playerData.put("Health", health);
        playerData.put("Max Health", maxHealth);
        playerData.put("Experience", experience);
    }
    public static void setDefaultStats() {
        switch (type) {
            case "Warrior":
               setStats(15, 15, 35, 35, 0);
            case "Sorcerer":
                setStats(10, 10, 30, 30, 0);
                magicAbility = true;
            case "Healer":
               setStats(10, 10, 50, 50, 0);
            case "Paladin":
                setStats(15, 15, 35, 35, 0);
            case "Default":
                setStats(15, 15, 15, 15, 0);
                default:
                setStats(15, 15, 15, 15, 0);
        }
    }
    public static void takeDamage(Character character, int damage) {
        character.health -= damage;
    }
    public static void heal(Character character) {
        character.health += 5;
        System.out.println("You have gained 5 HP.");
    }
}
