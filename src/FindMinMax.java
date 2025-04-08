import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入十個數字
        String input = scanner.nextLine();

        // 將輸入的字串根據空白分隔開來
        String[] numbers = input.split(" ");

        // 初始化最大值和最小值
        double maxValue = Double.parseDouble(numbers[0]);
        double minValue = Double.parseDouble(numbers[0]);

        // 用 for 迴圈找出最大值與最小值
        for (String numStr : numbers) {
            double num = Double.parseDouble(numStr);
            if (num > maxValue) {
                maxValue = num;
            }
            if (num < minValue) {
                minValue = num;
            }
        }

        // 輸出最大值與最小值，保留小數點後兩位
        System.out.printf("max: %.2f\n", maxValue);
        System.out.printf("min: %.2f\n", minValue);
    }
}
