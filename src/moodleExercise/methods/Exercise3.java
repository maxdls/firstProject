package moodleExercise.methods;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = kbd.nextLine();
        System.out.println("The middle character in the string: " + middle(str) + "\n");
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}