package com.if3;

public class CommandLineArguments {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No values");
        } else {
            String values = String.join(",", args);
            System.out.println(values);
        }
}
}
