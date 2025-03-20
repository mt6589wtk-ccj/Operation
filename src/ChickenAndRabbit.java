import java.util.Scanner;

public class ChickenAndRabbit {
    public static void main(String[] args) {
        // 創建 Scanner 物件來讀取使用者的輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入頭的數量和腳的數量
        System.out.print("請輸入頭的數量: ");
        int heads = scanner.nextInt();

        System.out.print("請輸入腳的數量: ");
        int legs = scanner.nextInt();

        // 判斷解是否有解
        if (legs % 2 != 0 || heads < 0 || legs < 0) {
            System.out.println("輸入的數據無效，請重新確認頭和腳的數量！");
        } else {
            // 用方程式計算雞和兔的數量
            int rabbits = (legs - 2 * heads) / 2;
            int chickens = heads - rabbits;

            // 如果計算結果不是非負整數，則無解
            if (rabbits < 0 || chickens < 0) {
                System.out.println("這個問題沒有解，請檢查數據！");
            } else {
                System.out.println("雞的數量: " + chickens);
                System.out.println("兔的數量: " + rabbits);
            }
        }

        // 關閉 Scanner 物件
        scanner.close();
    }
}
