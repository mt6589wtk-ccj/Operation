import java.util.Scanner;

public class CokeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入初始購買的可樂瓶數
        System.out.print("請輸入購買的可樂瓶數 N: ");
        int n = scanner.nextInt();

        // 方法一：標準方案
        int totalDrinksStandard = calculateDrinks(n, false);
        System.out.println("標準方案最多能喝: " + totalDrinksStandard + " 瓶");

        // 方法二：借一個空罐子的方案
        int totalDrinksBetter = calculateDrinks(n, true);
        System.out.println("借一個空罐子最多能喝: " + totalDrinksBetter + " 瓶");

        scanner.close();
    }

    public static int calculateDrinks(int n, boolean borrowEmptyBottle) {
        int totalDrinks = n; // 喝掉初始購買的可樂
        int emptyBottles = n;

        // 如果借了一個空罐子
        if (borrowEmptyBottle) {
            emptyBottles += 1;
        }

        // 瓶子兌換新可樂
        while (emptyBottles >= 3) {
            int newCokes = emptyBottles / 3; // 每3瓶換1瓶
            totalDrinks += newCokes;        // 喝掉新換的可樂
            emptyBottles = emptyBottles % 3 + newCokes; // 更新空瓶數
        }

        // 最後如果借了一個空罐子，需要還回去
        if (borrowEmptyBottle) {
            emptyBottles -= 1;
        }

        return totalDrinks;
    }
}