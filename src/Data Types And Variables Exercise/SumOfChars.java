import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = scan.nextLine().charAt(0);
            sum += num;
        }
        System.out.printf("%d", sum);
    }
}