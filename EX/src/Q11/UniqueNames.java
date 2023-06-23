package Q11;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        String csvFilePath1 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2012short.csv";
        String csvFilePath2 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2013short.csv";
        String csvFilePath3 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2014short.csv";
        Map<String, String> names1 = readNames(csvFilePath1);
        Map<String, String> names2 = readNames(csvFilePath2);
        Map<String, String> names3 = readNames(csvFilePath3);

        Set<String> uniqueNames = new HashSet<>();

        for (String name : names1.keySet()) {
            String gender = names1.get(name);
            if (!names2.containsKey(name)) {
                uniqueNames.add(name + " (" + gender + ")");
            } else if (!names2.get(name).equals(gender)) {
                uniqueNames.add(name + " (" + gender + " & " + names2.get(name) + ")");
            }
        }

        for (String name : names2.keySet()) {
            String gender = names2.get(name);
            if (!names1.containsKey(name)) {
                uniqueNames.add(name + " (" + gender + ")");
            } else if (!names1.get(name).equals(gender)) {
                uniqueNames.add(name + " (" + names1.get(name) + " & " + gender + ")");
            }
        }

        for (String name : names3.keySet()) {
            String gender = names3.get(name);
            if (!names1.containsKey(name) && !names2.containsKey(name)) {
                uniqueNames.add(name + " (" + gender + ")");
            } else if (names1.containsKey(name) && !names1.get(name).equals(gender)) {
                uniqueNames.add(name + " (" + names1.get(name) + " & " + gender + ")");
            } else if (names2.containsKey(name) && !names2.get(name).equals(gender)) {
                uniqueNames.add(name + " (" + names2.get(name) + " & " + gender + ")");
            }
        }

        int totalNames = names1.size() + names2.size() + names3.size();

        System.out.println("Total number of names in the three files: " + totalNames);
        System.out.println("Total number of unique names: " + uniqueNames.size());
        System.out.println("Unique names with genders:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }

    public static Map<String, String> readNames(String csvFilePath) {
        Map<String, String> names = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String gender = fields[1];
                names.put(name, gender);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }
}

