// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be
// taken from user).

import java.util.Scanner;

public class CalculateAngle {
    public double calcAngle(int hour, int minute) {
        if (hour > 12 || hour < 1 || minute > 60 || minute < 1) {
            System.out.println("Invalid inputs!");
            return 0.0;
        }

        double angle = Math.abs((30 * hour) - (5.5 * minute));

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter the minute: ");
        int minute = sc.nextInt();

        CalculateAngle time = new CalculateAngle();
        double angle = time.calcAngle(hour, minute);

        System.out.println(angle + " degree");

        sc.close();
    }
}
