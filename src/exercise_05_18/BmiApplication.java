package exercise_05_18;

public class BmiApplication {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm)");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your wieght (kg)");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight, height);
        BmiUtility.printDiagnose(bmi);
    }
}
