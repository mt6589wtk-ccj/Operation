import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入菱形的大小，必須是奇數
        System.out.print("請輸入菱形的大小（奇數）：");
        int n = scanner.nextInt();

//         確保輸入的是奇數
        if (n % 2 == 0) {
            System.out.println("請輸入奇數大小！");
            return;
        }

        // 上半部分
        for (int i = 0; i < n / 2 + 1; i++) {
            // 輸出空格
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            // 輸出星號
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 下半部分
        for (int i = n / 2 - 1; i >= 0; i--) {
            // 輸出空格
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            // 輸出星號
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
