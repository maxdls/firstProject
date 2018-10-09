package exercise_05_18;

import java.util.Scanner;

public class KeyboardUtility {
    public static int readInt() {
        Scanner keyboard = new Scanner(System.in);
        int value = keyboard.nextInt();
        return value;
    }
}
