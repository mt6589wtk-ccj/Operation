import java.util.Scanner;

public class CokeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取多組資料，直到遇到無效的輸入結束
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();  // 輸入購買的可樂瓶數 N
            int totalDrinksBetter = calculateDrinks(n, true);  // 計算借一個空罐子後最多能喝的可樂數
            System.out.println(totalDrinksBetter);  // 輸出結果
        }

        scanner.close();
    }

    public static int calculateDrinks(int n, boolean borrowEmptyBottle) {
        int totalDrinks = n;  // 喝掉初始購買的可樂
        int emptyBottles = n;

        // 如果借了一個空罐子
        if (borrowEmptyBottle) {
            emptyBottles += 1;
        }

        // 瓶子兌換新可樂
        while (emptyBottles >= 3) {
            int newCokes = emptyBottles / 3;  // 每3瓶換1瓶
            totalDrinks += newCokes;          // 喝掉新換的可樂
            emptyBottles = emptyBottles % 3 + newCokes;  // 更新空瓶數
        }

        // 最後如果借了一個空罐子，需要還回去
        if (borrowEmptyBottle) {
            emptyBottles -= 1;
        }

        return totalDrinks;
    }
}
