package Ff;

interface  Dd{
    default void abstractMethod(){
        System.out.println("hello folks");
    }
}
public class Mm {
    public static void main(String[] args) {
        Dd my = new Dd() {
        };
                my.abstractMethod();
            }
        }


