import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 輸入兩個整數
        System.out.print("請輸入第一個整數: ");
        int num1 = scanner.nextInt();

        System.out.print("請輸入第二個整數: ");
        int num2 = scanner.nextInt();

        // 顯示選擇運算的選項
        System.out.println("請選擇運算類型：");
        System.out.println("+. 加法");
        System.out.println("-. 減法");
        System.out.println("*. 乘法");
        System.out.println("/. 除法");

        // 讀取使用者的選擇
        System.out.print("請輸入選擇的運算符號 (+ - * /): ");
        String operator = scanner.next();

        // 根據選擇進行運算
        switch (operator) {
            case "+":
                System.out.println("結果: " + (num1 + num2) + " (+)");
                break;
            case "-":
                System.out.println("結果: " + (num1 - num2) + " (-)");
                break;
            case "*":
                System.out.println("結果: " + (num1 * num2) + " (*)");
                break;
            case "/":
                // 除法，檢查除數是否為 0
                if (num2 != 0) {
                    System.out.println("結果: " + (num1 / num2) + " (/)");
                } else {
                    System.out.println("錯誤：除數不能為 0");
                }
                break;
            default:
                System.out.println("錯誤：無效的選擇");
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
