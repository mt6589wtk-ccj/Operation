import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        // 創建 Scanner 物件以便接收用戶的輸入
        Scanner scanner = new Scanner(System.in);

        // 創建一個數組來儲存輸入的數字
        float[] numbers = new float[10];

        // 讀取用戶輸入的數字並將其存入數組
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextFloat();
        }

        // 設定初始最大值和最小值
        float max = numbers[0];
        float min = numbers[0];

        // 使用 for 迴圈來找出最大值與最小值
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // 更新最大值
            }
            if (numbers[i] < min) {
                min = numbers[i]; // 更新最小值
            }
        }

        // 輸出最大值和最小值，保留小數點後兩位
        System.out.printf("max: %.2f\n", max);
        System.out.printf("min: %.2f\n", min);
    }
}
