package day7;

public class cubic {
    public static void main(String[] args) {
        int n = 5;  // Change this value to calculate for a different n
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println("Cubic sum of first " + n + " natural numbers is: " + sum);
    }
}


