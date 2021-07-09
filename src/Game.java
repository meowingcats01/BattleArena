import java.util.Scanner;

public class Game {
    // Initialize game
    static Scanner playerInput = new Scanner(System.in);
    static String playerName;
    static Character hero = new Character();
    static Healer healer = new Healer();
    static int userSelection;
    static boolean error = false;
    static UserManager userManager = new UserManager();

    public static void main(String[] args) {
        healer.type = "Healer";
        playerName = UserManager.getUserInput("What's your name?");
        System.out.println("Welcome to BattleArena, " + playerName);
        hero.name = userManager.getUserInput("What would you like your hero's name to be?");
        System.out.println("Your hero's name is " + hero.name);
        UserManager.waitForUser();
        hero.setDefaultStats(hero);
        healer.setDefaultStats(healer);
        hero.showStats();
        System.out.println("You can increase your stats by battling the enemies as well as leveling up.");
        System.out.println("You gain XP by battling enemies.");
        userManager.waitForUser();
        userSelection = userManager.getUserSelection("Battle", "Heal", "Quit");
        switch(userSelection) {
            case 1:
                System.out.println("Sorry, this feature hasn't been implemented yet. LOL!");
                break;
            case 2:
                healer.heal(hero);
                healer.heal(healer);
                System.out.println("You have been restored to full HP.");
            case 3:
                System.out.println("Goodbye, " + playerName);
                System.exit(0);
            default:
                while (userSelection < 0 | userSelection > 3) {
                    System.out.println("Please enter a number between 1 and 3.");
                    userSelection = userManager.getUserSelection("Battle", "Heal", "Quit");
                }
        }
    }
}