import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入一個整數
        System.out.print("請輸入一個整數: ");
        int score = scanner.nextInt();

        // 判斷輸入的整數是否小於 0
        if (score < 0) {
            System.out.println("輸入錯誤");
        }
        // 判斷輸入的整數是否大於 100
        else if (score > 100) {
            System.out.println("輸入錯誤");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("不及格");
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
