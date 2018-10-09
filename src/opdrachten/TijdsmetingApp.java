package Opdrachten;
        import java.util.*;

public class TijdsmetingApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int startHour, startMin, stopHour, stopMin, hourDiff, minDiff;
        System.out.println("\nOp welke dag bent u begonnen? (1: maandag - 7: zondag) ");
        int startDay = keyboard.nextInt();
        do {
            System.out.println("Om hoe laat bent u begonnen? (uur) ");
            startHour = keyboard.nextInt();
        } while (startHour < 0 || startHour > 23);
        do {
            System.out.println("Om hoe laat bent u begonnen? (minuten) ");
            startMin = keyboard.nextInt();
        } while (startMin < 0 || startMin > 59);
        do {
            System.out.println("Om hoe laat bent u gestopt? (uur) ");
            stopHour = keyboard.nextInt();
        } while (stopHour < 0 || stopHour > 23);
        do {
            System.out.println("Om hoe laat bent u gestopt? (minuten) ");
            stopMin = keyboard.nextInt();
        } while (stopMin < 0 || stopMin > 59);
        if (startDay == 1 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.19) + (((stopHour * 60) + stopMin) * 0.24);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.24) + (((stopHour * 60) + stopMin) * 0.29);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour < startHour && stopMin < startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.29) + (((stopHour * 60) + stopMin) * 0.19);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 1 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.19) + (((stopHour * 60) + stopMin) * 0.24);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.24) + (((stopHour * 60) + stopMin) * 0.29);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour < startHour && stopMin > startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = ((1440 - ((startHour * 60) + startMin)) * 0.29) + (((stopHour * 60) + stopMin) * 0.19);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 1 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.24 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour > startHour && stopMin < startMin) {
            hourDiff = stopHour - startHour;
            minDiff = 60 - (startMin - stopMin);
            System.out.print("Gepresteerde uren: " + --hourDiff + "u" + minDiff);
            double wage = 0.29 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 1 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.19 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.24 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour > startHour && stopMin > startMin) {
            hourDiff = stopHour - startHour;
            minDiff = stopMin - startMin;
            System.out.print("Gepresteerde uren: " + hourDiff + "u" + minDiff);
            double wage = 0.29 * ((hourDiff * 60) + minDiff);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 1 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.24 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour > startHour && stopMin == startMin) {
            hourDiff = stopHour - startHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.29 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 1 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 2 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 3 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 4 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = 0.19 * (hourDiff * 60);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 5 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = ((1440 - (startHour * 60)) * 0.19) + ((stopHour * 60) * 0.24);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 6 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = ((1440 - (startHour * 60)) * 0.24) + ((stopHour * 60) * 0.29);
            System.out.println("\nLoon: €" + wage);
        } else if (startDay == 7 && stopHour < startHour && stopMin == startMin) {
            int difference = 24 - startHour;
            hourDiff = difference + stopHour;
            System.out.print("Gepresteerde uren: " + hourDiff + "u00");
            double wage = ((1440 - (startHour * 60)) * 0.29) + ((stopHour * 60) * 0.19);
            System.out.println("\nLoon: €" + wage);
        }
    }
}
