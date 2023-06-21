package Q8;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the color code");
        String A=scanner.next();
        switch (A){
            case "R":
                System.out.println("Red");
                break;
            case"Y":
                System.out.println("yellow");
                break;
            case "B":
                System.out.println("blue");
                break;
            default:
                System.out.println("invalid code");
                break;
        }
    }
}
