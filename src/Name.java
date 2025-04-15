import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示使用者輸入一串整數
        System.out.println("請輸入一串整數（用空白分隔）：");
        String line = input.nextLine();  // 讀取整行字串

        // 將字串依空白分割，轉成字串陣列
        String[] parts = line.split(" ");

        // 宣告整數陣列，轉換字串成整數
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // 反轉輸出
        System.out.print("反轉後的陣列：");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
