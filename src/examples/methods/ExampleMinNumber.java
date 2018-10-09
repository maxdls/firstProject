package examples.methods;
import java.util.Scanner;
public class ExampleMinNumber {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please fill in a number");
        int n1 = kbd.nextInt();
        System.out.println("Please fill in another number");
        int n2 = kbd.nextInt();
        int min = minFunction(n1,n2);
        System.out.println("Lowest value is: " + min);
        System.out.println("Fill in a double");
        double d1 = kbd.nextDouble();
        System.out.println("Fill in another double");
        double d2 = kbd.nextDouble();
        double d3 = minFunction(d1,d2);
        System.out.println("Minimum value is: " + d3);
    }
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
    public static double minFunction(double n1, double n2) {
        return (n1 < n2) ? n1:n2;
    }
}

