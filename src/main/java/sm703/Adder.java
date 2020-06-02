package sm703;

public class Adder {
    private int num1;
    private int num2;

    public Adder() {
        this(2, 3);
    }

    public Adder(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addNumbers() {
        return this.num1 + this.num2;
    }

    public static void main(String[] args) {
        System.out.println("Hello...");
        System.out.println("Welcome to Addatron. This is a sophisticated adder tool.");
        int number1 = 5;
        int number2 = 3;
        Adder adder = new Adder(number1, number2);
        System.out.println("Adding " + number1 + " and " + number2 + "...");
        System.out.println("Result = " + adder.addNumbers());
    }
}
