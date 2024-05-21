public class Loops {
    public static void main(String args[]) {
        // for (int counter = 0; counter <= 2000; counter++) {
        // System.out.println(counter);
        // }

        // for (int i = 0; i < 11; i++) {
        // System.out.println("*");
        // }

        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // int i = 0;
        // do {
        // System.out.println(i);
        // i = i + 1;
        // } while (i < 11);

        int n = 4;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}