import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入 n
        System.out.print("請輸入聖誕樹的高度 n (必須大於 3): ");
        int n = scanner.nextInt();

        // 確保 n > 3
        if (n <= 3) {
            System.out.println("聖誕樹的高度必須大於 3！");
            return;
        }

        // 樹葉部分
        for (int i = 0; i < n; i++) {
            // 輸出空白
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // 輸出 *
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 樹幹部分
        int trunkHeight = 3; // 樹幹高度
        int trunkWidth = 3;  // 樹幹寬度
        int spaces = (n * 2 - 1 - trunkWidth) / 2; // 計算樹幹左側空白
        for (int i = 0; i < trunkHeight; i++) {
            // 輸出空白，使樹幹居中對齊
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // 輸出樹幹
            for (int k = 0; k < trunkWidth; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}