package Readcsv3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultiple {
    public static void main(String[] args) {
        String Pa1 = "C:\\Users\\vikky\\Desktop\\testing\\yob2012short.csv";
        String Pa2 = "C:\\Users\\vikky\\Desktop\\testing\\yob2013short.csv";
        String Pa3 = "C:\\Users\\vikky\\Desktop\\testing\\yob2014short.csv";
        readCSVFile(Pa1);
        readCSVFile(Pa2);
        readCSVFile(Pa3);

    }

    public static void readCSVFile(String filePath) {
        try (BufferedReader re = new BufferedReader(new FileReader(filePath))) {
            String li;
            while ((li = re.readLine()) != null) {
                String[] da = li.split("");
                for (String value : da) {
                    System.out.print(value );
                }
                System.out.println();
            }
        } catch (IOException e) {

        }
    }
}