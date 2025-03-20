import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入一個大於0的整數
        System.out.print("請輸入大於0的整數 N: ");
        int N = scanner.nextInt();

        // 檢查輸入是否大於0
        if (N <= 0) {
            System.out.println("請輸入一個大於0的整數！");
        } else {
            // 計算從1到N的總和
            long sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            // 顯示結果
            System.out.println(+ sum);
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
