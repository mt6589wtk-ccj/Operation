import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10]; // 用來記錄每個數字出現的次數

        System.out.println("請輸入 10 個 0-9 的數字：");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num >= 0 && num <= 9) {
                count[num]++; // 累加該數字的出現次數
            } else {
                System.out.println("輸入的數字不在 0-9 範圍內！");
                i--; // 如果輸入錯誤，重複此輪輸入
            }
        }

        int maxCount = 0;
        int mostFrequentNum = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentNum = i;
            }
        }

        System.out.println("出現次數最多的數字是：" + mostFrequentNum + "，次數為：" + maxCount);
    }
}