package Q5;

public class DigitorAlphabet {
    public static void main(String[] args) {
        char ch = '7';

        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
