import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入 10 個浮點數（以空格間隔）：");

        // 讀取整行輸入並分割成數字陣列
        String input = scanner.nextLine();
        String[] numbers = input.split(" "); // 使用空格分割
        if (numbers.length != 10) {
            System.out.println("輸入的數字必須剛好 10 個，請重新執行程式！");
            return;
        }

        float max = Float.MIN_VALUE; // 初始最大值設為最小浮點數值
        float min = Float.MAX_VALUE; // 初始最小值設為最大浮點數值

        for (String numStr : numbers) {
            try {
                float num = Float.parseFloat(numStr.trim()); // 轉換為浮點數並移除多餘空白
                if (num > max) {
                    max = num; // 更新最大值
                }
                if (num < min) {
                    min = num; // 更新最小值
                }
            } catch (NumberFormatException e) {
                System.out.println("輸入包含非數字字符，請重新執行程式！");
                return;
            }
        }

        System.out.println("最大值為：" + max);
        System.out.println("最小值為：" + min);
    }
}