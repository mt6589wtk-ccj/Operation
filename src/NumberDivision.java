import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入一個整數
        System.out.print("請輸入一個整數: ");
        int number = scanner.nextInt();

        // 判斷輸入的數字是否大於 999
        if (number > 999) {
            System.out.println("數值過大");
        } else {
            // 進行除法操作並顯示商數
            int quotient1 = number / 10;  // 除以10
            int remainder1 = number % 10; // 除以10的餘數

            int quotient2 = remainder1 / 5; // 餘數除以5
            int remainder2 = remainder1 % 5; // 餘數除以5的餘數

            int quotient3 = remainder2 / 1; // 餘數除以1

            // 顯示結果
            System.out.println("商數（除以 10）: " + quotient1);
            System.out.println("商數（餘數除以 5）: " + quotient2);
            System.out.println("商數（餘數除以 1）: " + quotient3);
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
