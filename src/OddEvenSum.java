import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; // 儲存使用者輸入的10個整數
        int oddSum = 0; // 儲存奇數位的總和
        int evenSum = 0; // 儲存偶數位的總和

        System.out.println("請輸入10個整數：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            // 判斷數字所在的位置（0為第一位，1為第二位...）
            if ((i + 1) % 2 == 0) { // 偶數位
                evenSum += numbers[i];
            } else { // 奇數位
                oddSum += numbers[i];
            }
        }

        // 輸出兩組數字的總和
        System.out.println("奇數位數字的總和為：" + oddSum);
        System.out.println("偶數位數字的總和為：" + evenSum);

        scanner.close();
    }
}