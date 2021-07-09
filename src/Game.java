import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    // Initialize game
    static Scanner playerInput = new Scanner(System.in);
    static String playerName;
    ArrayList<String> heroParty = new ArrayList<>();
    private static int heroCounter = 0;
    static int userSelection;
    static UserManager userManager = new UserManager();

    // Method to create character and count each instance of a character
    public static Character createCharacter() {
        Character character = new Character();
        character.name = userManager.getUserInput("What do you want your character's name to be?");
        int type = userManager.getUserSelection("What do you want your character's class to be?", "Default", "Paladin", "Healer");
        switch (type) {
            case 2:
                character = new Paladin();
                character.type = "Paladin";
            case 3:
                character = new Healer();
                character.type = "Healer";
            default:
                character = new Character();
                character.type = "Default";
        }
        System.out.println("Character created!");
        heroCounter++;
        return character;
    }

    public static void main(String[] args) {
        playerName = UserManager.getUserInput("What's your name?");
        System.out.println("Welcome to BattleArena, " + playerName);
        var hero = createCharacter();
        System.out.println("Your hero's name is " + hero.name);
        UserManager.waitForUser();
        System.out.println("Your hero's class is " + hero.type);
        userManager.waitForUser();
        System.out.println("Your hero's stats are:");
        hero.setDefaultStats();
        hero.showStats();
        System.out.println("You can increase your stats by battling the enemies as well as leveling up.");
        System.out.println("You gain XP by battling enemies.");
        userManager.waitForUser();
        userSelection = userManager.getUserSelection("What do you want to do?","Battle", "Heal", "Quit");
        switch(userSelection) {
            case 1:
                System.out.println("Sorry, this feature hasn't been implemented yet. LOL!");
                break;
            case 2:
                hero.heal(hero);
            case 3:
                System.out.println("Goodbye, " + playerName);
                System.exit(0);
            default:
                while (userSelection < 0 | userSelection > 3) {
                    System.out.println("Please enter a number between 1 and 3.");
                    userSelection = userManager.getUserSelection("What do you want to do?","Battle", "Heal", "Quit");
                }
        }
    }
}