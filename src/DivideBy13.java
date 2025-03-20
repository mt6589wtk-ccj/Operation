import java.util.Scanner;

public class DivideBy13 {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入一個整數
        System.out.print("請輸入一個整數: ");
        int number = scanner.nextInt();

        // 計算商數和餘數
        int quotient = number / 13;
        int remainder = number % 13;

        // 顯示結果
        System.out.println("商數: " + quotient);
        System.out.println("餘數: " + remainder);

        // 關閉 Scanner 物件
        scanner.close();
    }
}
