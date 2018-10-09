package examples.algorithms.selection;
import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter your age");
        int age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        keyboard.close();
    }
}
