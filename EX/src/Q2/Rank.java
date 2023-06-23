package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        String csvFilePath1 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2012short.csv";
        String csvFilePath2 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2013short.csv";
        String csvFilePath3 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2014short.csv";

        Map<String, String> namesAndGenders = readCSVFiles(csvFilePath1, csvFilePath2, csvFilePath3);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter a gender: ");
        String gender = scanner.nextLine().trim();

        if (namesAndGenders.containsKey(name) && namesAndGenders.get(name).equals(gender)) {
            System.out.println("Match found: 1");
        } else {
            System.out.println("No match found: -1");
        }

        scanner.close();
    }

    public static Map<String, String> readCSVFiles(String... csvFilePaths) {
        Map<String, String> namesAndGenders = new HashMap<>();

        for (String csvFilePath : csvFilePaths) {
            try (Scanner scanner = new Scanner(new File(csvFilePath))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] fields = line.split(",");
                    if (fields.length >= 2) {
                        String name = fields[0].trim();
                        String gender = fields[1].trim();
                        namesAndGenders.put(name, gender);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return namesAndGenders;
    }
}
