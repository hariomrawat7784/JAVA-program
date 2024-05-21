
import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();

        // if (buttom == 1) {
        // System.out.println("Hello");
        // } else if (buttom == 2) {
        // System.out.println("namaste");
        // } else if (buttom == 3) {
        // System.out.println("Have a nice day");
        // } else {
        // System.out.println("smaller number");

        // }
        switch (buttom) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Have a nice day");
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}