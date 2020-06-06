package sm703;

public class Adder {

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Hello...");
        System.out.println("Welcome to Addatron. This is a sophisticated adder tool.");
        Adder adder = new Adder();
        System.out.println("Adding 3 and 5 result is " + adder.addNumbers(3, 5));
    }
}
