package Homework;

import java.util.ArrayList;

public class Home {
    public static void main(String[] args) {


    ArrayList<Set> na = new ArrayList<Set>();{

        na.add(new Set("vikas","vikas@email.com",222));
        na.add(new Set("reddy","reddy@email.com",224));
        na.add(new Set("ravi","ravi@email.com",225));
        na.add(new Set("sai","sai@email.com",226));

        System.out.println(na.stream().noneMatch(set -> set.getName().startsWith("z")));
        na.stream();

    }

}}
