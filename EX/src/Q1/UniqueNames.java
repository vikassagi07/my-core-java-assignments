package Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        String csvFilePath1 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2012short.csv";
        String csvFilePath2 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2013short.csv";
        String csvFilePath3 = "C:\\\\Users\\\\vikky\\\\Desktop\\\\testing\\\\yob2014short.csv";
        Set<String> na1 = readNames(csvFilePath1);
        Set<String> na2 = readNames(csvFilePath2);
        Set<String> na3 = readNames(csvFilePath3);

        Set<String> uni = new HashSet<>();

        for (String nam : na1) {
            if (!na2.contains(nam)) {
                uni.add(nam);
            }}
        for (String na : na2) {
            if (!na1.contains(na)) {
                uni.add(na);
            }}
        for (String nam : na3) {
            if (!na1.contains(nam)) {
                uni.add(nam);
            }}
        System.out.println("Total number of unique names: " + uni.size());
        System.out.println("Unique names: " + uni);
    }
    public static Set<String> readNames(String csvFilePath) {
        Set<String> names = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String li;
            while ((li = reader.readLine()) != null) {
                String[] fields = li.split(",");
                String name = fields[0];
                names.add(name);
            }
        } catch (IOException e) {

        }

        return names;
    }}
