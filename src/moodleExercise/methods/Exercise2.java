package moodleExercise.methods;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double d1 = kbd.nextDouble();
        System.out.println("Input the second number: ");
        double d2 = kbd.nextDouble();
        System.out.println("Input the third number: ");
        double d3 = kbd.nextDouble();
        System.out.println("The average value is: " + average(d1, d2, d3) + "\n");
    }
    public static double average(double d1, double d2, double d3)
    {
        return (d1+d2+d3)/3;
    }
}
