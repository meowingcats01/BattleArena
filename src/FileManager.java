import java.io.*;
import java.util.Scanner;

public class FileManager {
    /*
    to do: make 5 game save slots
        (NOTE: if a slot is used and the player tries to save using that slot it will give a warning)
     */
   public static void createFile() throws Exception {
        String baseDir = System.getProperty("user.home");
        File saveDir = new File(baseDir + "\\BattleArena\\saves\\");
        File saveFile = new File(saveDir + "gameSave.txt");
        if (saveFile.createNewFile()) {
            System.out.println("Save file created successfully:" + saveFile.getName());
        } else {
            System.out.println("Save file already exists.");
        }
    }

    public static void readFile(File file) throws FileNotFoundException{
       Scanner readFile = new Scanner(file);
            while(readFile.hasNextLine()) {
                String data = readFile.nextLine();
            }
    }

    private static void writeStats(FileWriter saveWriter) throws IOException {
       saveWriter.write(Character.strength);
            saveWriter.write(",");
            saveWriter.write(Character.defense);
            saveWriter.write(",");
            saveWriter.write(Character.health);
            saveWriter.write(",");
            saveWriter.write(Character.health);
            saveWriter.write(",");
            saveWriter.write(Character.maxHealth);
            saveWriter.write(",");
            saveWriter.write(Character.experience);
            saveWriter.close();
    }

    public static void writeFile(File file) throws IOException {
        FileWriter saveWriter = new FileWriter(file);
        writeStats(saveWriter);
        System.out.println("Successfully saved progress.");
    }
}