package Readcsv2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HowToRead {
    public static void main(String[] args) {
        String Pa1 = "C:\\Users\\vikky\\Desktop\\testing\\yob2012short.csv";



        Set<String> uni = new HashSet<>();
        try (BufferedReader vikky = new BufferedReader(new FileReader(Pa1))) {
            String il;
            while ((il = vikky.readLine()) != null) {
                System.out.println(il);
            }
        } catch (IOException ignored) {

        }
    }
}