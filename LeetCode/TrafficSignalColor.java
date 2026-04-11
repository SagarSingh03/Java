// LeetCode : Contest : Biweekly 180 easy
public class TrafficSignalColor {
    public static void main(String[] args) {
        int timer = 0;
        if (timer == 0) {
            System.out.print("Green");
        } else if (timer == 30) {
            System.out.print("Orange");
        } else if (timer > 30 && timer <= 90) {
            System.out.print("Red");
        } else if (timer < 30 && timer > 90) {
            System.out.print("Invalid");
        }
    }
}
