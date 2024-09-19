package visual.code;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Điều kiện dừng
        } else {
            return n * factorial(n - 1); // Đệ quy
        }
    }

    public static void main(String[] args) {
        int number = 9;
        int result = factorial(number);
        System.out.println("Giai thua cua " + number + " la: " + result);
    }
}