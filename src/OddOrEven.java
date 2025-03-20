import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入一個整數
        System.out.print("請輸入一個整數: ");
        int number = scanner.nextInt();

        // 使用條件運算子來判斷是偶數還是奇數
        String result = (number % 2 == 0) ? "偶數" : "奇數";

        // 顯示結果
        System.out.println(number + " 是 " + result);

        // 關閉 Scanner 物件
        scanner.close();
    }
}
