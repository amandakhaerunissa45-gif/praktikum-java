public class Factorial {
    public int num;

    public Factorial(int num) {
        this.num = num;
    }

    public int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            expression.append(i);
            if (i < num) {
                expression.append(" * ");
            }
        }

        return "Factorial: " + num + "! = " + expression
                + " = " + getFactorial();
    }

    public static void main(String[] args) {
        Factorial value = new Factorial(10);
        System.out.println(value);
    }
}
