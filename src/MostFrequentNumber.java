import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10]; // 用來記錄每個數字出現的次數

        // 輸入10個數字
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            // 如果數字不在範圍內，顯示 "Out of range"
            if (num < 0 || num > 9) {
                System.out.println("Out of range");
                return; // 退出程式
            }
            count[num]++; // 累加該數字的出現次數
        }

        int maxCount = 0;
        int mostFrequentNum = -1;

        // 找出出現次數最多的數字
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentNum = i;
            }
        }

        // 輸出結果
        System.out.println(mostFrequentNum + "," + maxCount);
    }
}
