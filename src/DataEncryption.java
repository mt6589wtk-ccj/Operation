import java.util.Scanner;

public class DataEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入四位數字
        System.out.print("請輸入四位數: ");
        int input = scanner.nextInt(); // 接收四位數字輸入

        // 將四位數分解成陣列
        int[] data = new int[4];
        data[0] = (input / 1000) % 10; // 提取千位
        data[1] = (input / 100) % 10;  // 提取百位
        data[2] = (input / 10) % 10;   // 提取十位
        data[3] = input % 10;          // 提取個位

        // 第一步：每項數據加 7，然後除以 10 取餘數
        for (int i = 0; i < 4; i++) {
            data[i] = (data[i] + 7) % 10;
        }

        // 第二步：對調第一個數字與第三個數字
        int temp = data[0];
        data[0] = data[2];
        data[2] = temp;

        // 第三步：對調第二個數字與第四個數字
        temp = data[1];
        data[1] = data[3];
        data[3] = temp;

        // 輸出加密後的數據
        System.out.print("加密後的數據: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(data[i]);
        }

        scanner.close();
    }
}