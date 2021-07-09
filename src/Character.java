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
        playerData.put("Strength", strength);
        playerData.put("Defense", defense);
        playerData.put("Health", health);
        playerData.put("Max Health", maxHealth);
        playerData.put("Experience", experience);
    }
    public static void setDefaultStats(Character character) {
        switch (character.type) {
            case "Warrior":
               setStats(15, 15, 35, 35, 0);
            case "Sorcerer":
                setStats(10, 10, 30, 30, 0);
                magicAbility = true;
            case "Healer":
               setStats(10, 10, 50, 50, 0);
            default:
                setStats(15, 15, 15, 15, 0);
        }
    }
}
