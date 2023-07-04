package com.intro;

import java.util.ArrayList;
import java.util.Scanner;

public class Walmart {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("vik");
        names.add("nik");
        names.add("sag");
        names.remove("nik");
        names.add("rao");

        for(int i =0; i<names.size();i++)

        {
            System.out.println(names.get(i));
        }
    }
    Scanner scanner = new Scanner(System.in);
    }

