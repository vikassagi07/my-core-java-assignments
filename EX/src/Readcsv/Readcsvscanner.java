package Readcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readcsvscanner {
    public static void main(String[] args) throws FileNotFoundException {
        String[] box={"C:\\Users\\vikky\\Desktop\\testing\\yob2013short.csv","C:\\Users\\vikky\\Desktop\\testing\\yob2014short.csv",
                "C:\\Users\\vikky\\Desktop\\testing\\yob2012short.csv"};
        for (String cat:box)
        {
            Scanner sc=new Scanner(new File(cat));
//            sc.useDelimiter("  ,  ");
            while (sc.hasNext()){
                System.out.println(sc.next());

        }
            sc.close();

        }

    }
}