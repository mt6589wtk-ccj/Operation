import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10]; // 用來記錄每個數字出現的次數
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num >= 0 && num <= 9) {
                count[num]++; // 累加該數字的出現次數
            }
        }
        // 檢查是否有超過 10 個數字輸入
        if (scanner.hasNextInt()) {
            System.out.println("Out of range");
            return; // 如果多於 10 個數字輸入，停止程式
        }
        int maxCount = 0;
        int mostFrequentNum = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentNum = i;
            }
        }

        System.out.println( mostFrequentNum + "," + maxCount);
    }
}