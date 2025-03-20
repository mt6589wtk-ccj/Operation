import java.util.Scanner;

public class GenderCalculation {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示選擇性別
        System.out.println("請選擇性別:");
        System.out.println("1. 男生");
        System.out.println("2. 女生");
        System.out.print("請輸入選擇的性別 (1 或 2): ");
        int genderChoice = scanner.nextInt();

        // 根據選擇性別來執行不同的運算
        if (genderChoice == 1 || genderChoice == 2) {
            // 輸入數字 N（整數）
            System.out.print("請輸入數字 N: ");
            int N = scanner.nextInt();  // 這裡改為整數型別
            int result = 0;

            if (genderChoice == 1) {
                // 男生運算 (N - 80) / 10 * 7
                result = (int) ((N - 80) / 10 * 7);
                System.out.println("男生運算結果: " + result);
            } else {
                // 女生運算 (N - 70) / 10 * 6
                result = (int) ((N - 70) / 10 * 6);
                System.out.println("女生運算結果: " + result);
            }
        } else {
            System.out.println("無效的選擇，請選擇 1 或 2.");
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
