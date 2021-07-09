import java.util.Scanner;

public class UserManager {
    static Scanner playerInput = new Scanner(System.in);
    static boolean error = false;
    static String getUserInput(String input) {
        String result = "";
        System.out.println(input);
        try {
            result = playerInput.nextLine();
        } catch (Exception e) {
            System.out.println("Sorry, there was an error. Please try again.");
            while (error) {
                try {
                    result = playerInput.nextLine();
                    error = false;
                } catch (Exception e1) {
                    System.out.println("Sorry, there was an error. Please try again.");
                    error = true;
                }
            }
        }
        while (result == "") {
            System.out.println("Please enter something.");
            try {
                result = playerInput.nextLine();
            } catch (Exception e) {
                System.out.println("Sorry, there was an error. Please try again.");
                while (error) {
                    try {
                        result = playerInput.nextLine();
                        error = false;
                    } catch (Exception e1) {
                        System.out.println("Sorry, there was an error. Please try again.");
                        error = true;
                    }
                }
            }
        }
        return result;
    }
    static int getUserInput(int input) {
        int result = 0;
        System.out.println(input);
        try {
            result = playerInput.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, there was an error. Please try again.");
            error = true;
            while (error) {
                try {
                    result = playerInput.nextInt();
                    error = false;
                } catch (Exception e1) {
                    System.out.println("Sorry, there was an error. Please try again.");
                    error = true;
                }
            }
        }
        while (result == 0) {
            System.out.println("Please enter something.");
            try {
                result = playerInput.nextInt();
            } catch (Exception e) {
                System.out.println("Sorry, there was an error. Please try again.");
                while (error) {
                    try {
                        result = playerInput.nextInt();
                        error = false;
                    } catch (Exception e1) {
                        System.out.println("Sorry, there was an error. Please try again.");
                        error = true;
                    }
                }
            }
        }
        return result;
    }
    // Get user's choice from a selection of choices
    static int getUserSelection(String... options) {
        int result = 0;
        System.out.println("Choose one of the following:");
        int cycle = 1;
        for (String s: options) {
           System.out.println("(" + cycle + ") " + s);
           cycle++;
            }
            System.out.println("Please enter a number between 1 and " + options.length);
        try {
            result = playerInput.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, there was an error. Please try again.");
            while(result == 0) {
                System.out.println("Please enter a value.");
                result = playerInput.nextInt();
            }
            while (result < 0 | result > 3) {
                System.out.println("Please enter a number between 1 and " + options.length);
                try {
                    result = playerInput.nextInt();
                } catch (Exception e1) {
                    System.out.println("Sorry, there was an error. Please try again.");
                }
            }
        }
        return result;
    }
    // Prompt user to press a key to continue
    static void waitForUser() {
        System.out.println("Press Enter to continue.");
        playerInput.nextLine();
    }
}
