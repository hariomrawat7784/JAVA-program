public class MathOperations {
    public int add(int a, int b) {
        return a + b;   
        
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Add two integers
        int result1 = math.add(5, 10);
        System.out.println("Result 1: " + result1);

        // Add two doubles
        double result2 = math.add(3.5, 2.5);
        System.out.println("Result 2: " + result2);

        // Add three integers
        int result3 = math.add(2, 4, 6);
        System.out.println("Result 3: " + result3);
    }
}
