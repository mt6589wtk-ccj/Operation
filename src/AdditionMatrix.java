import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入 W 和 H
        System.out.print("請輸入正整數 W: ");
        int w = scanner.nextInt();
        System.out.print("請輸入正整數 H: ");
        int h = scanner.nextInt();

        // 顯示 WxH 的加法矩陣 (W 和 H 從 0 開始)
        for (int i = 0; i <= h; i++) { // H 從 0 開始
            for (int j = 0; j <= w; j++) { // W 從 0 開始
                System.out.printf("%5d", i + j); // 每個數值占5位元，無空格分隔
            }
            System.out.println(); // 換行
        }

        scanner.close();
    }
}