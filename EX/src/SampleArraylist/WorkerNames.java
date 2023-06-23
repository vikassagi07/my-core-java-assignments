package SampleArraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerNames {
    public static void main(String[] args) {
        ArrayList<String> na = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String wr = "";
        while (!wr.equalsIgnoreCase("quit")) {
            wr = scanner.nextLine();
            if (wr.equalsIgnoreCase(" ")) {
                for (String name : na) {
                    System.out.println(name);
                        }}
            {   na.add(wr);
                    }}}}


