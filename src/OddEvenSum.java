import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; // 儲存使用者輸入的10個整數
        int oddSum = 0; // 儲存奇數位的總和
        int evenSum = 0; // 儲存偶數位的總和

        System.out.println("請輸入10個整數：");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        oddSum=numbers[0]+numbers[2]+numbers[4]+numbers[6]+numbers[8];
        evenSum=numbers[1]+numbers[3]+numbers[5]+numbers[7]+numbers[9];
        // 輸出兩組數字的總和
        System.out.println(oddSum+","+ evenSum);

        scanner.close();
    }
}